FROM daocloud.io/liushaoping/maven-tomcat
MAINTAINER Shaoping Liu <spieled916@gmail.com>
ADD pom.xml /var/tmp/
RUN cd /var/tmp/ && mvn -q dependency:resolve

ADD src /var/tmp/src
#构建应用
RUN cd /var/tmp/ && mvn -q -DskipTests=true package \
        #拷贝编译结果到指定目录
        && rm -rf $CATALINA_HOME/webapps/* \
        && mv target/*.war $CATALINA_HOME/webapps/ROOT.war \
        #清理编译痕迹
        && cd / && rm -rf /var/tmp/

EXPOSE 8080
CMD ["catalina.sh","run"]
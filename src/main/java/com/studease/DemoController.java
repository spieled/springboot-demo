package com.studease;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.UUID;

/**
 * Created by Shaoping Liu<spieled916@gmail.com> on 2016-12-11 22:53.
 */
@RestController
@RequestMapping("visitors")
public class DemoController {

	@Autowired
	VisitorRepository visitorRepository;

	@RequestMapping("visit")
	public String visit(HttpServletRequest request){

		Visitor visitor = new Visitor();
		visitor.setId(UUID.randomUUID().toString());
		visitor.setIp(request.getRemoteAddr());
		visitor.setVisitDate(new Date());

		visitorRepository.save(visitor);

		Long count =  visitorRepository.count();

		return String.format("你是来自%s的第%d位访问者。",request.getRemoteAddr(),count);
	}
}


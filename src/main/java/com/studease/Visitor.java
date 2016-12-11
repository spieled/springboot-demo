package com.studease;

import java.util.Date;

/**
 * Created by Shaoping Liu<spieled916@gmail.com> on 2016-12-11 23:17.
 */
public class Visitor {
	private String id;
	private String ip;
	private Date visitDate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Date getVisitDate() {
		return visitDate;
	}

	public void setVisitDate(Date visitDate) {
		this.visitDate = visitDate;
	}
}

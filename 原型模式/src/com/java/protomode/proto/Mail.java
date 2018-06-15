package com.java.protomode.proto;

import java.util.ArrayList;

import com.java.protomode.EventTemplate;

/**
 * 原型模式，邮件对象通过实现克隆接口，实现对象的克隆拷贝
 */
public class Mail implements Cloneable {
	private String receiver;
	private String subject;
	private String content;
	private String tail;
	private ArrayList<String> ars;
	public Mail(EventTemplate et) {
		this.tail = et.geteventContent();
		this.subject = et.geteventSubject();
	
	}

	@Override
	public Mail clone() {
		Mail mail = null;
		try {
			mail = (Mail) super.clone();
			mail.ars = (ArrayList<String>)this.ars.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return mail;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public String getTail() {
		return tail;
	}

	public void setTail(String tail) {
		this.tail = tail;
	}

}

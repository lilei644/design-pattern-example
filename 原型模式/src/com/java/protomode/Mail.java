package com.java.protomode;

/**
 * 传统模式，定义邮件的内容对象
 */
public class Mail {
	private String receiver;
	private String subject;
	private String content;
	private String tail;

	public Mail(EventTemplate et) {
		this.tail = et.geteventContent();
		this.subject = et.geteventSubject();
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

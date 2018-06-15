package com.java.protomode;

/**
 * 传统模式，发送邮件的事件任务
 */
public class EventTemplate {
    private String eventSubject, eventContent;

    public EventTemplate(String eventSubject, String eventContent) {
        this.eventSubject = eventSubject;
        this.eventContent = eventContent;
    }

    public String geteventSubject() {
        return eventSubject;
    }

    public String geteventContent() {
        return eventContent;
    }
}

package com.java.protomode.proto;

import java.util.Random;

import com.java.protomode.EventTemplate;

/**
 * 原型模式，通过对象的拷贝快速克隆对象，降低重复创建对象的耗时
 */
public class MainTest {
    public static void main(String[] args) {
        int i = 0;
        int MAX_COUNT = 10;
        EventTemplate et = new EventTemplate("9月份信用卡账单", "国庆抽奖活动...");

        Mail mail = new Mail(et);

        while (i < MAX_COUNT) {
            // 以下是每封邮件不同的地方
            Mail cloneMail = mail.clone();
            cloneMail.setContent(getRandString(5) + ",先生（女士）:你的信用卡账单..."
                    + mail.getTail());
            cloneMail.setReceiver(getRandString(5) + "@" + getRandString(8)
                    + ".com");
            // 然后发送邮件
            sendMail(cloneMail);
            i++;
        }

    }

    public static String getRandString(int maxLength) {
        String source = "abcdefghijklmnopqrskuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer sb = new StringBuffer();
        Random rand = new Random();
        for (int i = 0; i < maxLength; i++) {
            sb.append(source.charAt(rand.nextInt(source.length())));
        }
        return sb.toString();
    }

    public static void sendMail(Mail mail) {
        System.out.println("标题：" + mail.getSubject() + "\t收件人："
                + mail.getReceiver() + "\t内容：" + mail.getContent()
                + "\t....发送成功！");
    }

}

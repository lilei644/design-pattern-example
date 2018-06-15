package com.java.protomode;

import java.util.Random;

/**
 * 传统模式，通过循环遍历所有的用户，发送账单邮件
 * 缺点：效率慢，耗时长
 */
public class MainTest {
    public static void main(String[] args) {
        int i = 0;
        int MAX_COUNT = 10;
        EventTemplate et = new EventTemplate("9月份信用卡账单", "国庆抽奖活动...");

        Mail mail = new Mail(et);

        while (i < MAX_COUNT) {
            // 以下是每封邮件不同的地方

            mail.setContent(getRandString(5) + ",先生（女士）:你的信用卡账单..."
                    + mail.getTail());
            mail.setReceiver(getRandString(5) + "@" + getRandString(8) + ".com");
            // 然后发送邮件
            sendMail(mail);
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

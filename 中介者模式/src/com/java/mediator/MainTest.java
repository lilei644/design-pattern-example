package com.java.mediator;

/**
 * 中介者模式：用一个中介对象来封装一系列的对象交互
 */
public class MainTest {

    public static void main(String[] args) {

        // 定义闹钟，咖啡机，窗帘，电视等组件，用中介者集中管控
        Mediator mediator = new ConcreteMediator();
        Alarm mAlarm = new Alarm(mediator, "mAlarm");
        CoffeeMachine mCoffeeMachine = new CoffeeMachine(mediator,
                "mCoffeeMachine");
        Curtains mCurtains = new Curtains(mediator, "mCurtains");
        TV mTV = new TV(mediator, "mTV");
        mAlarm.SendAlarm(0);
        mCoffeeMachine.FinishCoffee();
        mAlarm.SendAlarm(1);
    }

}

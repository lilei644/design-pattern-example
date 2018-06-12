package com.java.mediator;

import java.util.HashMap;


/**
 * 中介者模式，中介者，用于集中管理所有的组件控制，协调各组件的功能
 */
public class ConcreteMediator implements Mediator {
    private HashMap<String, Colleague> colleagueMap;
    private HashMap<String, String> interMap;

    public ConcreteMediator() {
        colleagueMap = new HashMap<String, Colleague>();
        interMap = new HashMap<String, String>();
    }

    @Override
    public void Register(String colleagueName, Colleague colleague) {
        colleagueMap.put(colleagueName, colleague);


        if (colleague instanceof Alarm) {
            interMap.put("Alarm", colleagueName);
        } else if (colleague instanceof CoffeeMachine) {
            interMap.put("CoffeeMachine", colleagueName);
        } else if (colleague instanceof TV) {
            interMap.put("TV", colleagueName);
        } else if (colleague instanceof Curtains) {
            interMap.put("Curtains", colleagueName);
        }

    }

    @Override
    public void GetMessage(int stateChange, String colleagueName) {

        if (colleagueMap.get(colleagueName) instanceof Alarm) {
            if (stateChange == 0) {
                ((CoffeeMachine) (colleagueMap.get(interMap
                        .get("CoffeeMachine")))).StartCoffee();
                ((TV) (colleagueMap.get(interMap.get("TV")))).StartTv();
            } else if (stateChange == 1) {
                ((TV) (colleagueMap.get(interMap.get("TV")))).StopTv();
            }

        } else if (colleagueMap.get(colleagueName) instanceof CoffeeMachine) {
            ((Curtains) (colleagueMap.get(interMap.get("Curtains"))))
                    .UpCurtains();

        } else if (colleagueMap.get(colleagueName) instanceof TV) {

        } else if (colleagueMap.get(colleagueName) instanceof Curtains) {

        }

    }

    @Override
    public void SendMessage() {

    }

}

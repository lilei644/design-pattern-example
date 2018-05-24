package com.java.agentmode.dyn;

import java.lang.reflect.Proxy;

/**
 * 动态代理，保护代理，只能使用代理提供的方法
 */
public class MatchService {
    public MatchService() {

        PersonBean joe = getPersonInfo("joe", "male", "running");

        PersonBean OwnerProxy = getOwnerProxy(joe);

        System.out.println("Name is " + OwnerProxy.getName());
        System.out.println("Interests is " + OwnerProxy.getInterests());

        OwnerProxy.setInterests("Bowling");
        System.out.println("Interests are " + OwnerProxy.getInterests());
        OwnerProxy.setHotOrNotRating(50);
        System.out.println("Rating is " + OwnerProxy.getHotOrNotRating());
        OwnerProxy.setHotOrNotRating(40);
        System.out.println("Rating is " + OwnerProxy.getHotOrNotRating());

        System.out.println("**************");

        PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
        System.out.println("Name is " + nonOwnerProxy.getName());
        System.out.println("Interests are " + nonOwnerProxy.getInterests());
        nonOwnerProxy.setInterests("haha");
        System.out.println("Interests are " + nonOwnerProxy.getInterests());
        nonOwnerProxy.setHotOrNotRating(60);
        System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());

    }

    PersonBean getPersonInfo(String name, String gender, String interests) {
        PersonBean person = new PersonBeanImpl();
        person.setName(name);
        person.setGender(gender);
        person.setInterests(interests);
        return person;
    }

    PersonBean getOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(person.getClass()
                        .getClassLoader(), person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person));
    }

    PersonBean getNonOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(person.getClass()
                        .getClassLoader(), person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person));
    }
}

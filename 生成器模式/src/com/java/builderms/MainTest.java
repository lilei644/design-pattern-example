package com.java.builderms;

import com.java.builderms.builder.Builder3d;
import com.java.builderms.builder.Builder4d;
import com.java.builderms.builder.BuilderSelf;

/**
 * 生成器模式，简化复杂对象的生成
 * 旅游计划项目，对于用户来说只关心旅游日期和开始时间，可以自动展示出所有计划即可
 */
public class MainTest {

    public static void main(String[] args) {

        Director mDirector = new Director(new Builder4d("2015-12-29"));

        mDirector.construct();

        mDirector.setBuilder(new Builder3d("2015-8-30"));
        mDirector.construct();
        testself();
    }

    public static void testself() {
        BuilderSelf builder = new BuilderSelf("2015-9-29");

        builder.addTicket("Plane Ticket").addEvent("Fly to Destination")
                .addEvent("Supper").addHotel("Hilton");

        builder.addDay().addTicket("Zoo Ticket").addEvent("Bus to Zoo")
                .addEvent("Feed animals").addHotel("Home Inn");

        builder.addDay();
        builder.addTicket("Beach");
        builder.addEvent("Swimming");
        builder.addHotel("Home inn");

        builder.addDay().addTicket("Plane Ticket").addEvent("Fly to Home");
        builder.getVacation().showInfo();
    }

}

package com.java.builderms.builder;

/**
 * 生成器模式，定义3天旅游的生成器对象
 */
public class Builder3d extends AbsBuilder {

    public Builder3d(String std) {
        super(std);
    }

    @Override
    public void buildDay(int i) {
        mVacation.setVacationDay(i);

    }

    @Override
    public void addHotel(String hotel) {
        mVacation.setHotel(hotel);
    }

    @Override
    public void addTicket(String ticket) {
        mVacation.addTicket(ticket);
    }

    @Override
    public void addEvent(String event) {
        mVacation.addEvent(event);
    }

    @Override
    public void buildvacation() {
        addTicket("Plane Ticket");
        addEvent("Fly to Destination");
        addEvent("Supper");
        addEvent("Dancing");
        addHotel("Four Seasons");

        mVacation.addDay();
        addTicket("Theme Park");
        addEvent("Bus to Park");
        addEvent("lunch");
        addHotel("Four Seasons");

        mVacation.addDay();

        addTicket("Plane Ticket");
        addEvent("City Tour");
        addEvent("Fly to Home");

    }

}

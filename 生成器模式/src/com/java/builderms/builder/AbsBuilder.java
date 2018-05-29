package com.java.builderms.builder;

import com.java.builderms.vacation.Vacation;

/**
 * 生成器模式，定义抽象生成器，定义基本的抽象方法
 */
public abstract class AbsBuilder {

	public Vacation mVacation;

	public AbsBuilder(String std) {
		mVacation = new Vacation(std);
	}

	public abstract void buildvacation();

	public abstract void buildDay(int i);

	public abstract void addHotel(String hotel);

	public abstract void addTicket(String ticket);

	public abstract void addEvent(String tvent);

	public Vacation getVacation() {

		return mVacation;

	}

}

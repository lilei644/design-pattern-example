package com.java.builderms.vacation;

import java.util.ArrayList;
import java.util.Date;

/**
 * 旅游安排的对象，定义旅游日期，酒店，门票以及活动等属性和基础方法
 */
public class VacationDay {
	private Date mDate;
	private String mHotels;
	private ArrayList<String> mTickets = null;
	private ArrayList<String> mEvents = null;

	public VacationDay(Date date) {
		mDate = date;
		mTickets = new ArrayList<String>();
		mEvents = new ArrayList<String>();
	}

	public void setDate(Date date) {
		mDate = date;
	}

	public void setHotel(String mHotels) {
		this.mHotels = mHotels;
	}

	public void addTicket(String ticket) {
		mTickets.add(ticket);
	}

	public void addEvent(String event) {
		mEvents.add(event);
	}

	public String showInfo() {
		StringBuilder stb = new StringBuilder();
		stb.append("Date:" + mDate.toString() + "\n");
		stb.append("Hotel:" + mHotels + "\n");
		stb.append("Tickets:" + mTickets.toString() + "\n");
		stb.append("Events" + mEvents.toString() + "\n");

		return stb.toString();
	}
}

package com.java.builderms.vacation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * 对外提供的假期旅游对象，用于制定计划的生成器使用
 */
public class Vacation {
    private ArrayList<VacationDay> mVacationDayLst;
    private Date mStDate;
    private int mDays = 0;
    private VacationDay mVacationDay;

    public Vacation(String std) {
        mVacationDayLst = new ArrayList<VacationDay>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            mStDate = sdf.parse(std);
            mVacationDay = new VacationDay(mStDate);
            mVacationDayLst.add(mVacationDay);
            mDays++;
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void setStDate(String std) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            mStDate = sdf.parse(std);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    public Date getStDate() {

        return mStDate;
    }

    public void addDay() {

        mVacationDay = new VacationDay(nextDate(mDays));
        mVacationDayLst.add(mVacationDay);
        mDays++;
    }

    public boolean setVacationDay(int i) {
        if ((i > 0) && (i < mVacationDayLst.size())) {
            mVacationDay = mVacationDayLst.get(i);
            return true;
        }
        mVacationDay = null;
        return false;
    }

    public void setHotel(String mHotels) {
        mVacationDay.setHotel(mHotels);
    }

    public void addTicket(String ticket) {
        mVacationDay.addTicket(ticket);
    }

    public void addEvent(String event) {
        mVacationDay.addEvent(event);
    }

    public void showInfo() {
        for (int i = 0, len = mVacationDayLst.size(); i < len; i++) {
            System.out.println("** " + (i + 1) + " day**");
            System.out.println(mVacationDayLst.get(i).showInfo());

        }
    }

    private Date nextDate(int n) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(mStDate);
        cal.add(Calendar.DATE, n);
        return cal.getTime();
    }
}

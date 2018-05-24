package com.java.agentmode.dyn;

/**
 * 定义代理的接口方法
 */
public interface PersonBean {
	String getName();
	String getGender();
	String getInterests();
	int getHotOrNotRating();
	
	void setName(String name);
	void setGender(String gender);
	void setInterests(String interests);
	void setHotOrNotRating(int rating);
}

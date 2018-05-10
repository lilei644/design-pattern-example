package com.java.facademode;

import com.java.facademode.hometheater.HomeTheaterFacade;


/**
 * 外观模式，封装统一的接口，提供给外部访问
 */
public class MainTest {
	public static void main(String[] args) {
		HomeTheaterFacade mHomeTheaterFacade=new HomeTheaterFacade();

		// 用户只调用需要的总开关即可
		mHomeTheaterFacade.ready();
		mHomeTheaterFacade.play();
	}
}

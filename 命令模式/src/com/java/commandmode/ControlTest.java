package com.java.commandmode;

import com.java.commandmode.device.Light;
import com.java.commandmode.device.Stereo;

/**
 * 面向对象模式，所有命令统一放置在遥控对象内进行判断处理
 */
public class ControlTest {
	public static void main(String[] args) {
		Control ctl;
		Light light = new Light("Bedroom");
		Stereo stereo = new Stereo();
		ctl = new TraditionControl(light, stereo);

		ctl.onButton(0);
		ctl.offButton(0);
		ctl.onButton(1);
		ctl.onButton(2);
		ctl.offButton(2);

		ctl.offButton(1);
	}
}

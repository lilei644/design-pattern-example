package com.java.commandmode;

import com.java.commandmode.device.Light;
import com.java.commandmode.device.Stereo;

/**
 * 面向对象模式，遥控对象根据按钮的序号进行相应的处理
 */
public class TraditionControl implements Control {
	Light light;
	Stereo stereo;

	public TraditionControl(Light light, Stereo stereo) {
		this.light = light;
		this.stereo = stereo;
	}

	@Override
	public void onButton(int slot) {
		// TODO Auto-generated method stub
		switch (slot) {
		case 0:
			light.On();
			break;
		case 1:
			stereo.On();
			break;
		case 2:
			int vol = stereo.GetVol();
			if (vol < 11) {
				stereo.SetVol(++vol);
			}
			break;
		}
	}

	@Override
	public void offButton(int slot) {
		// TODO Auto-generated method stub
		switch (slot) {
		case 0:
			light.Off();
			break;
		case 1:
			stereo.Off();
			break;
		case 2:
			int vol = stereo.GetVol();
			if (vol > 0) {
				stereo.SetVol(--vol);
			}
			break;
		}
	}

	@Override
	public void undoButton() {
		// TODO Auto-generated method stub
		
	}
}

package com.java.commandmode.command;

import com.java.commandmode.device.Light;

/**
 * 命令模式，电灯关闭的命令操作
 */
public class LightOffCommand implements Command {
	private Light light;
	public LightOffCommand(Light light)
	{
		this.light=light;
	}
	@Override
	public void execute() {
		light.Off();
	}

	@Override
	public void undo() {
		light.On();
	}

}

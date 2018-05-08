package com.java.commandmode.command;

import com.java.commandmode.device.Light;

/**
 * 命令模式，电灯打开的命令操作
 */
public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.On();
    }

    @Override
    public void undo() {
        light.Off();
    }
}

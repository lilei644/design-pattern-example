package com.java.commandmode.command;

import com.java.commandmode.device.Stereo;

/**
 * 命令模式，打开收音机的命令
 */
public class StereoOnCommand implements Command {
    private Stereo setreo;

    public StereoOnCommand(Stereo setreo) {
        this.setreo = setreo;
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        setreo.On();
        setreo.SetCd();

    }

    @Override
    public void undo() {
        // TODO Auto-generated method stub
        setreo.Off();
    }

}

package com.java.commandmode.command;

import com.java.commandmode.device.Stereo;

/**
 * 命令模式，收音机调小音量
 */
public class StereoSubVolCommand implements Command {
    private Stereo setreo;

    public StereoSubVolCommand(Stereo setreo) {
        this.setreo = setreo;
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        int vol = setreo.GetVol();
        if (vol > 0) {
            setreo.SetVol(--vol);
        }

    }

    @Override
    public void undo() {
        // TODO Auto-generated method stub
        int vol = setreo.GetVol();
        if (vol < 11) {
            setreo.SetVol(++vol);
        }

    }

}

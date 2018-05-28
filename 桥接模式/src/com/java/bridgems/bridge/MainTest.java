package com.java.bridgems.bridge;

import com.java.bridgems.control.LGControl;
import com.java.bridgems.control.SharpControl;
import com.java.bridgems.control.SonyControl;


/**
 * 桥接模式
 * 通过抽象类定义需要用到的方法抽象以及拓展方法的实现
 * 接口定义底层有的所有功能方法
 * 不同的对象实现不同的接口方法
 * 将实现接口的对象引入到抽象类中
 */
public class MainTest {
    public static void main(String[] args) {
        TvControl mLGTvControl;
        TvControl mSonyTvControl;

        // 定义统一的基础遥控器，传入不同的厂家控制器则实现不同的方法
        mSonyTvControl = new TvControl(new SonyControl());
        mLGTvControl = new TvControl(new LGControl());
        mLGTvControl.Onoff();
        mLGTvControl.nextChannel();
        mLGTvControl.nextChannel();
        mLGTvControl.preChannel();
        mLGTvControl.Onoff();

        mSonyTvControl.Onoff();
        mSonyTvControl.preChannel();
        mSonyTvControl.preChannel();
        mSonyTvControl.preChannel();
        mSonyTvControl.Onoff();

        // 定义统一新型的遥控器，传入不同的厂家控制器则实现不同的方法
        newTvControl mSharpTvControl;
        mSharpTvControl = new newTvControl(new SharpControl());
        mSharpTvControl.Onoff();
        mSharpTvControl.nextChannel();
        mSharpTvControl.setChannel(9);
        mSharpTvControl.setChannel(28);
        mSharpTvControl.Back();
        mSharpTvControl.Onoff();

    }
}

package com.java.mediator;

/**
 * 中介者模式，闹钟对象，属于中介者控制的组件
 */
public class Alarm extends Colleague {

	public Alarm(Mediator mediator, String name) {
		super(mediator, name);
		mediator.Register(name, this);
	}

	public void SendAlarm(int stateChange) {
		SendMessage(stateChange);
	}

	@Override
	public void SendMessage(int stateChange) {
		this.GetMediator().GetMessage(stateChange, this.name);
	}

}

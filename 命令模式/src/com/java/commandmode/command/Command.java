package com.java.commandmode.command;

/**
 * 命令模式，命令方法接口
 */
public interface Command {
	public void execute();
	public void undo();
}

package com.java.commandmode.command;

import java.util.Stack;

import com.java.commandmode.Control;

/**
 * 命令模式，所有响应均可抽象成命令，调用时直接调用命令执行方法即可
 */
public class CommandModeControl implements Control {
    private Command[] onCommands;
    private Command[] offCommands;

    // 定义一个栈记录命令，便于完成撤销操作
    private Stack<Command> stack = new Stack<Command>();

    public CommandModeControl() {
        onCommands = new Command[5];
        offCommands = new Command[5];

        Command noCommand = new NoCommand();

        for (int i = 0, len = onCommands.length; i < len; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }

    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;

    }


    // 开
    @Override
    public void onButton(int slot) {

        onCommands[slot].execute();
        stack.push(onCommands[slot]);
    }

    // 关
    @Override
    public void offButton(int slot) {

        offCommands[slot].execute();
        stack.push(offCommands[slot]);
    }

    // 返回
    @Override
    public void undoButton() {
        stack.pop().undo();
    }

}

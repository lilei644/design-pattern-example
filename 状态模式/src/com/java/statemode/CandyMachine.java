package com.java.statemode;

/**
 * 面向对象模式，糖果机
 */
public class CandyMachine {

    final static int SoldOutState = 0;          // 售罄状态
    final static int OnReadyState = 1;          // 准备售出状态
    final static int HasCoin = 2;               // 已经投了硬币的状态
    final static int SoldState = 3;             // 售出状态

    private int state = SoldOutState;
    private int count = 0;                      // 内部糖果的剩余数量

    public CandyMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = OnReadyState;
        }
    }

    /**
     * 投入硬币，如果糖果机状态是准备售出，则可以摇动把手购买糖果，其他的状态则无法使用
     */
    public void insertCoin() {
        switch (state) {
            case SoldOutState:
                System.out.println("you can't insert coin,the machine sold out!");
                break;
            case OnReadyState:
                state = HasCoin;
                System.out
                        .println("you have inserted a coin,next,please turn crank!");
                break;
            case HasCoin:
                System.out.println("you can't insert another coin!");

                break;
            case SoldState:
                System.out.println("please wait!we are giving you a candy!");

                break;
        }

    }

    /**
     * 如果已经投入硬币之后则可以选择退出硬币
     */
    public void returnCoin() {
        switch (state) {
            case SoldOutState:
                System.out
                        .println("you can't return,you haven't inserted a coin yet!");
                break;
            case OnReadyState:
                System.out.println("you haven't inserted a coin yet!");
                break;
            case HasCoin:

                System.out.println("coin return!");
                state = OnReadyState;

                break;
            case SoldState:
                System.out.println("sorry,you already have turned the crank!");

                break;
        }

    }

    /**
     * 如果已经投入硬币则可以摇动把手
     */
    public void turnCrank() {
        switch (state) {
            case SoldOutState:
                System.out.println("you turned,but there are no candies!");
                break;
            case OnReadyState:
                System.out.println("you turned,but you haven't inserted a coin!");
                break;
            case HasCoin:
                System.out.println("crank turn...!");
                state = SoldState;
                dispense();
                break;
            case SoldState:
                System.out.println("we are giving you a candy,turning another get nothing,!");
                break;
        }

    }

    /**
     * 掉出糖果
     */
    private void dispense() {
        count--;
        System.out.println("a candy rolling out!");
        if (count > 0) {
            state = OnReadyState;
        } else {
            System.out.println("Oo,out of candies");
            state = SoldOutState;
        }

    }

    public void printstate() {

        switch (state) {
            case SoldOutState:
                System.out.println("***SoldOutState***");
                break;
            case OnReadyState:
                System.out.println("***OnReadyState***");
                break;
            case HasCoin:
                System.out.println("***HasCoin***");

                break;
            case SoldState:
                System.out.println("***SoldState***");
                break;
        }

    }
}

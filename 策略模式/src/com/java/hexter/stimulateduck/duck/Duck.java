package com.java.hexter.stimulateduck.duck;

import com.java.hexter.stimulateduck.flybehavior.FlyBehavior;
import com.java.hexter.stimulateduck.quackbehavior.QuackBehavior;

public abstract class Duck {

	FlyBehavior mFlyBehavior;
	QuackBehavior mQuackBehavior;

	public Duck() {

	}

	public void Fly() {
		mFlyBehavior.fly();
	}

	public void Quack() {
		mQuackBehavior.quack();
	}

	public abstract void display();

	public void SetQuackBehavoir(QuackBehavior qb) {
		mQuackBehavior = qb;
	}

	public void SetFlyBehavoir(FlyBehavior fb) {
		mFlyBehavior = fb;
	}

	public void swim() {
		System.out.println("~~im swim~~");
	}
}

package com.java.coffeebar;

import com.java.coffeebar.coffee.Decaf;
import com.java.coffeebar.coffee.LongBlack;
import com.java.coffeebar.decorator.Chocolate;
import com.java.coffeebar.decorator.Milk;

/**
 * 装饰者示例，利用装饰者模式可将新功能更方便的添加到已有模块上，且不涉及已有模块的代码修改
 * 类似于包装，封装了一层对象，像给对象打包了一个盒子，然后在盒子上进行新的操作
 */
public class CoffeeBar {


	public static void main(String[] args) {
		
		Drink order;
		order=new Decaf();
		System.out.println("order1 price:"+order.cost());
		System.out.println("order1 desc:"+order.getDescription());
		
		System.out.println("****************");


		// 任意搭配，自定义添加组合方式
		// 选好一份咖啡后添加一次牛奶，两次巧克力
		// 用装饰者将对象包装起来，在装饰者内自定义新的方法逻辑，不影响老的对象
		order=new LongBlack();
		order=new Milk(order);
		order=new Chocolate(order);
		order=new Chocolate(order);
		System.out.println("order2 price:"+order.cost());
		System.out.println("order2 desc:"+order.getDescription());
		
	}


}

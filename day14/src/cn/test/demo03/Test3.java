package cn.test.demo03;


import java.util.Random;
//cn.test.demo03.Test3,导入包，类的全名
public class Test3 {
	public static void main(String[] args) {
		Animal aa = new Animal() {
			public void eat() {
				System.out.println("eat");
			}
			public void sleep() {
				System.out.println("sleep");
			}
		};
		//a.eat();
		aa.eat();
		aa.sleep();
	}
}

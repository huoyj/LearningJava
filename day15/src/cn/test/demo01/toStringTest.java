package cn.test.demo01;

import java.util.Random;
import java.util.Scanner;

public class toStringTest {
	public static void main(String[] args) {
		Person p = new Person("张数",22);
		String s = p.toString();
		//重点：输出语句中，如果写的是对象P，默认调用对象的toString 方法
		System.out.println(p);//p=p.toString()
		System.out.println(s);
		
		Random ran = new Random();
		System.out.println(ran);//未重写toString
		
		Scanner sc = new Scanner(System.in);
		System.out.println(sc);//重写了toString
	}

}

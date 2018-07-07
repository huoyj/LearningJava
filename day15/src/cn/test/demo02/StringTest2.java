package cn.test.demo02;

import java.net.Proxy.Type;

public class StringTest2 {
	public static void main(String[] args) {
		change();
		
	}
	/*
	 * StringBuffer 类方法
	 *  StringBuffer append，将任意类型的数据，添加到缓冲区
	 *  delete(int start,int end) 包含头不包含尾
	 *  insert(int index, 任意类型)将任意类型数据，添加到缓冲区指定索引
	 *  replace(int start,int end,String str)将指定索引范围内的所有字符，替换成新的字符串
	 *  reverse()将缓冲区中的字符反转，逆序排列 数组
	 *  toString() 继承Object，重新toString()将缓冲区中的所有字符，变成字符串
	 */
	public static void change() {
		StringBuffer buffer = new StringBuffer();
		//调用方法append添加
		buffer.append("12").append(false).append(333);	
		System.out.println(buffer);
		//调用方法delete
		buffer.delete(0, buffer.length()-4);
		System.out.println(buffer);
		//调用insert
		buffer.insert(1, "aaa");
		System.out.println(buffer);
		//调用replace,不同于String？？？？
		buffer.replace(0,3, "y");
		System.out.println(buffer);
		//调用reverse
		buffer.reverse();
		System.out.println(buffer);
		//调用toString()
		buffer.append(100001);
		String s = buffer.toString();//将可变的字符串缓冲区对象，变成了不可变，String类型
		System.out.println(s);
	}
}

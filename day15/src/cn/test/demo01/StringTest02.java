package cn.test.demo01;
/*
 * String类构造方法
 */
public class StringTest02 {
	public static void main(String[] args) {
		functon();
		function1();
	}
	
	public static void function1() {
		char[] ch = {'a','b','c','d'};
		String s = new String(ch);//不查询编码表
		System.out.println(s);
		
		String s1 = new String(ch,1,3);
		System.out.println(s1);
	}
	
	
	
	public static void functon() {
		byte[] bytes = {-97,-98,99,100};
		//调用String类的构造方法，传递字节数组
		String s = new String(bytes);//查看编码表，负数GBK，整数ASCII
		System.out.println(s);
		
		byte[] bytes1 = {65,66,67,68};
		String s1 = new String(bytes1,2,1);//2:代表开始的索引，1：代表个数
		System.out.println(s1);
	}
}

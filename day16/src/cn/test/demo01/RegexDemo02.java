package cn.test.demo01;

public class RegexDemo02 {
	public static void main(String[] args) {
		//splitDemo();
		//splitDemo3();
		replaceAl();
	}
	/*
	 * replaceAll(正则规则，替换后的新字符串)
	 * 
	 */
	public static void replaceAl() {
		String str = "Hello12345World6789012";
		String s = str.replaceAll("[\\d]+", "*");
		System.out.println(s);
	}
	/*
	 * 切割ip地址 172.28.38.83
	 */
	public static void splitDemo3() {
		String s = "172.28.38...83";
		String[] sp = s.split("[\\.]+");
		System.out.println("数组长度是"+sp.length);
		for(int i = 0 ;i<sp.length;i++) {
			System.out.println(sp[i]);
		}
	}
	
	/*
	 * 11 22 33 44 按照空格切割
	 */
	public static void splitDemo2() {
		String s = "11 22 33    44";
		String[] sp = s.split(" +");//x+ 出现一次或多次
		System.out.println("数组长度是"+sp.length);
		for(int i = 0 ;i<sp.length;i++) {
			System.out.println(sp[i]);
		}
	}
	
	/*
	 * String中split方法对字符串进行切割
	 * 12-22-44-00 按照-对字符串进行切割
	 */
	public static void splitDemo() {
		String s ="-12-22-44-00";
		String[] sp = s.split("-");
		System.out.println("数组长度是"+sp.length);
		for(int i = 0 ;i<sp.length;i++) {
			System.out.println(sp[i]);
		}
	}
}

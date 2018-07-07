package cn.test.demo02;

import java.util.Date;
public class DateDemo {
	public static void main(String[] args) {
		//毫秒介绍，0点1970年1月1日00:00:00
		long time = System.currentTimeMillis();
		System.out.println(" 打印当期日期的毫秒值System类currentTimeMillis()方法："+time);
		function();
		func();
		function3();
		function4();
	}
	/*
	 * Date类方法setTime(long)传递毫秒值
	 * 将日期对象，设置到指定毫秒值上
	 * 毫秒值转成日期对象
	 * 
	 */
	public static void function4() {
		Date date = new Date();
		//System.out.println(date);
		date.setTime(0);
		System.out.println(" 将毫秒值转换成日期，Date内setTime方法："+date);
	}
	/*
	 * Date类方法getTime() 返回值long
	 *  返回值是毫秒值
	 *  将Date表示的日期转成毫秒值
	 */
	public static void function3() {
		Date date = new Date(1529744757663L);
		long time = date.getTime();
		System.out.println(" 将日期转成毫秒值，Date内getTime方法："+time);
	}
	
	/*
	 * Date类的long参数的构造方法
	 * Date(long) 表示毫秒值
	 * 传递毫秒值转换成日期
	 * 
	 */
	public static void func() {
		Date date = new Date(1529744757663L);
		System.out.println(" 将毫秒值转换成日期，Date内传递long类型参数构造方法："+date);
		
	}
	/*
	 * Date空参构造方法
	 * 获取当前操作系统中的时间和日期
	 */
	public static void function() {
		Date date = new Date();
		System.out.println(" 当前操作系统时间日期，Date内空参构造方法："+date);//CST china standard time
	}
}

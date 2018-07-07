package cn.test.demo02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatDemo {
	public static void main(String[] args) {
		function();
	}
	
	/*
	 * 对日期格式化
	 * 1，创建SimpleDateFormat()对象
	 *   在类构造方法中，写入字符串的日期格式（自己定义）
	 * 2，SimpleDateFormat调用方法format对日期进行格式化
	 *   String format(Date date) 传递日期对象，返回字符串
	 *   日期模式：
	 *   yyyy 年份
	 *   MM  月份
	 *   dd 月中的天数
	 *   HH 0-23一天中的小时数
	 *   mm 小时中的分钟数
	 *   ss 秒
	 */
	
	public static void function() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy--MM-dd-HH-mm-ss");
		Date d = new Date(948792333333L);
		String date = sdf.format(d);
		System.out.println(date);
	}
}

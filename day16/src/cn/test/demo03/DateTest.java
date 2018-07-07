package cn.test.demo03;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class DateTest {
    public static void main(String[] args)throws Exception {
    	while (true) {
		//life();
		function();
    	}
    	
    	
	}
    /*
     * 计算闰年
     * 特征：2月份有29天
     * 高级算法：日历设置到指定年份的3月1日，add向前移一天，获取天数
     * 
     */
    public static void function() {
    	Calendar c = Calendar.getInstance();
    	System.out.println("请输入需要判断是否是闰年的年份:");
    	int year = new Scanner(System.in).nextInt();
    	//把日历设置到需要判断年份的3月1日
    	c.set(year,2,1);//不能写2018,3,1,
    	//add往前挪一天
    	c.add(Calendar.DAY_OF_MONTH,-1);
    	//获取该月的天数
    	int day = c.get(Calendar.DAY_OF_MONTH);
    	//判断是否是29天（闰年）
    	if (day == 29) {
    	System.out.println("YES");
    	}else {
    		System.out.println("NO");
    	}
    	
    }
    /*
     * 计算活了多少天
     * 两个日期， 生日 和今天日期，
     * 日期变毫秒值做减法
     */
    public static void life() throws Exception{
    	System.out.println("请输入出生日期：YYYY-MM-dd");
    	/*
    	Scanner birthday = new Scanner(System.in);
    	String birthdayString = birthday.next();
    	*/
    	String birthdayString = new Scanner(System.in).next();
    	
    	//出生日期
    	String birthday1 = "2990-11-28";
    	//将字符串类型转换成Date类型
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    	Date d = sdf.parse(birthdayString);
    	//将Date类型出生日期转换成毫秒值
    	long birthdaysecond = d.getTime();
    	//获取今天日期的毫秒值
    	long todaysecond = System.currentTimeMillis();
    	//计算今天-出生日期的毫秒值
    	long time = todaysecond - birthdaysecond;
    	//判断
    	if (time<0) {
    		System.out.println("not birth..");
    	}else {
    	System.out.println("你已经在在地球生活了"+time/1000/60/60/24+"天");
    	}
    }
}

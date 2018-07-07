package cn.test.demo02;

/*
 * 使用calendar类的子类
 * 
 * 静态方法getInstance（）直接返回子类的对象
 * 不需要直接new子类对象，通过静态方法直接获取
 */
import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {

	public static void main(String[] args) {
		function();
		function2();
		function3();
		function4();
	}
	/*
	 * Calendar类的方法getTime()
	 * 把日历对象，转成Date日期对象
	 */
	
	public static void function4() {
		Calendar c =  Calendar.getInstance();
		Date date = c.getTime();
		System.out.println(date);
		
	}
	/*
	 * add、 日历的偏移量，可以指定一个日历中的字段，进行整数的偏移 add(int field,int value)
	 */

	public static void function3() {
		Calendar c = Calendar.getInstance();
		// 让日历中的天数，向后偏移280天
		c.add(Calendar.DAY_OF_MONTH, -365);
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;// 外国月份是0-11月
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(year + "  " + month + "  " + day);

	}

	/*
	 * set方法 设置日历 1，set(int field,int value) field 设置的是哪个日历字段，value设置后的具体数值
	 * 
	 * 2，set(int year,int month,int day) 传递3个整数的年，月，日
	 */
	public static void function2() {
		Calendar c = Calendar.getInstance();
		// 设置月份，设置到10月份
		c.set(Calendar.MONTH, 9);
		// 设置年月日
		c.set(2010, 11, 12);

		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;// 外国月份是0-11月
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(year + "  " + month + "  " + day);

	}

	/*
	 * Calendar类get方法 获取日历字段的值 获取 日历字段的值 int get（int） 参数int 获取哪个日历字段 返回值，表示日历字段的具体指
	 */
	public static void function() {
		Calendar c = Calendar.getInstance();
		// System.out.println(c);
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;// 外国月份是0-11月
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(year + "  " + month + "  " + day);
	}
}

package cn.test.demo01;
/*
 * 把字符串转变成基本数据类型
 */
public class InterDemo {
	public static void main(String[] args) {
		function();
		function1();
		function2();
		function3();
	}
	/*
	 * Integer构造方法
	 * Integer (String s)
	 * 将数字格式的字符串，传递到Interger类的构造方法中
	 * 创建Integer 对象，包装的是一个字符串
	 * 将构造方法中的字符串，转成基本类型，intValue（）调用方法，非静态的
	 */
	public static void function3() {
		Integer in  = new Integer("111");
		int i = in.intValue();
		System.out.println("intValue将构造方法中的字符串转成int："+i--);
		System.out.println("intValue将构造方法中的字符串转成int："+i--);

		
	}
	
	/*
	 * 如何将基本类型int 变成字符串
	 * int ---> String 任何类型+"" 变成String类型
	 * Integer 类中的静态方法toString()
	 * toString(int ,int 进制)将int整数转成指定进制的数//java里最高36进制 0-9A-Z
	 */
	public static void function2() {
		int i = 121;
		String s = i+"";
		System.out.println("将int转成String:"+s+1);
		
		String s1 = Integer.toString(6,2);
		System.out.println("toString类型String:"+s1+9);
	}
	
	/*
	 * parseInt(String s ,int radix)
	 * radix 技术，进制
	 * "110,2"含义，前面的数字是二进制的，但是方法parseInt运行结果都是十进制
	 */
	public static void function1() {
		int i = Integer.parseInt("110",2);//方法的计算结果都是以十进制作为结果
		System.out.println("110二进制转成十进制输出是："+i);
	}
	
	public static void function() {
		int i= Integer.parseInt("-122");//java lang包内的不需要导入。必须是数字格式
		System.out.println("将字符串类型转成int类型parseInt:"+i/2);
	}
}

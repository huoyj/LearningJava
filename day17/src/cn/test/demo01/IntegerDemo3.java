package cn.test.demo01;
/*
 * JDK1.5后出现的特性
 * 自动装箱：基本数据类型，直接变成对象
 * 自动拆箱：对象中的数据变回基本数据类型
 */
public class IntegerDemo3 {
    public static void main(String[] args) {
		function2();
	}
    /*
     * 关于自动装箱和拆箱一些题目
     */
    public static void function2() {
    	Integer i = new Integer(1);
    	Integer j = new Integer(1);
    	System.out.println(i == j);//false 比较对象的地址
    	System.out.println(i.equals(j));//true 继承Object重写equals，比较对象的数据
    	
    	System.out.println("==============================");
    	
    	Integer a = 220;
    	Integer b = 220;
    	System.out.println(a==b);
    	System.out.println(a.equals(b));
    	
	    System.out.println("==============================");
    	//数据再byte范围内，jvm不会new对象
    	Integer aa = 127;//Integer aa = new Integer(127)
    	Integer bb = 127;//Integer bb = aa;
    	System.out.println(aa==bb);
    	System.out.println(aa.equals(bb));
    }
    
    //自动拆箱和装箱的弊端，空指针异常
    public static void function1() {
    	Integer in = null;//没有进行装箱，没有指向对象
    	if (in != null) {
    	//in = null.intValue()+1
    	in = in + 1;
    	System.out.println(in);
    	}
    }
    
    public static void function() {
    	/*引用类型，引用变量一定指向对象
    	 * 自动装箱，基本类型1，直接变成了对象
    	*/    	
    	Integer in = 1;//=Integer in = new Integer(1);
    	
    	System.out.println(in);
    	//in 是引用类型，不能和基本类型运算.自动拆箱，引用类型in，转成基本类型
    	//in+1 ----> in.intValue+1=2
    	//in = 1 自动装箱
    	in = in.intValue() + 1;
    	System.out.println(in);
    	in = in + 1;//in+1 ----> in.intValue+1=2
    	System.out.println(in);
    }
}

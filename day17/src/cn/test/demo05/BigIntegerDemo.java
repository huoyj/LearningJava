package cn.test.demo05;

import java.math.BigInteger;

public class BigIntegerDemo {
    public static void main(String[] args) {
		function1();
	}
    /*
     * 四则运算
     * 调用方法计算，计算结果也只能是BigInteger对象
     */
    public static void function1() {
    	BigInteger b1 = new BigInteger("1111111111111111111111111111");
    	//System.out.println(b1);
    	BigInteger b2 = new BigInteger("3333333333333333333333333333");
    	//加法 add
    	BigInteger bigadd = b1.add(b2);
    	System.out.println(bigadd);
    	
    	//减法 substract b2-b1
    	BigInteger bigSub = b2.subtract(b1);
    	System.out.println(bigSub);
    	//乘法，multiply
    	BigInteger bigMul = b1.multiply(b2);
    	System.out.println(bigMul);
    	//除法 divied b2/b1
    	BigInteger bigDiv = b2.divide(b1);
    	System.out.println(bigDiv);
    	
    }
    
    /*
     * BigInteger类的构造方法
     * 传递字符串，要求数字格式，没有长度限制
     */
    public static void function() {
    	BigInteger big = new BigInteger("1111111111111111111111111111");
    	System.out.println(big);
    	
    }
    
}

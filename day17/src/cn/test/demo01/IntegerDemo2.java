package cn.test.demo01;
/*
 * Integer其他方法
 * 包括三个方法，和2个静态成员变量
 */
public class IntegerDemo2 {
    public static void main(String[] args) {
    	function();
    	function1();
    	
    }
    /*
     * 三个静态方法
     * 做进制的转换
     * 十进制转成二进制 toBinaryString(int)
     * 十进制转成八进制 toOctalString(int)
     * 十进制转成十六进制 to HexString(int)
     * 三个方法，返回值都是String形式出现
     */
    public static void function1() {
    	System.out.println(Integer.toBinaryString(999));
    	System.out.println(Integer.toOctalString(999));
    	System.out.println(Integer.toHexString(999));

    }
    /*
     * MAX_VALUE
     * MIN_VALUE
     */
    public static void function() {
    	System.out.println(Integer.MAX_VALUE);
    	System.out.println(Integer.MIN_VALUE);
    }
}

package cn.test.demo03;

//java.lang,Math静态方法组成

public class MathDemo {
    public static void main(String[] args) {
		function5();
	}
    /*
     * static double round(double d)
     * 获取参数的四舍五入值,取整数
     */
    public static void function5() {
    	double d = Math.round(5.3);//加上1/2 --- 0.5
    	System.out.println(d);
    }
    
    /*
     * static double sqrt(double a)
     *返回参数的平方根
     */
    public static void function4() {
    	double d = Math.sqrt(-4);//NaN not a number
    	System.out.println(d);
    }
    /*
     * static double pow(double a,double b)
     * a的b次方
     */
    public static void function3() {
    	double d = Math.pow(2.1, 3);
    	System.out.println(d);
    }
    
    /*
     * static double floor(double d)
     * 返回小于或等于 参数d的最大整数
     */
    public static void function2() {
    	double d =Math.floor(1.4);
    	System.out.println(d);
    }
    /*
     * static double ceil(double d)
     * 返回大于或者等于参数d的最小整数
     */
    public static void function1() {
    	double d = Math.ceil(-3.1);
    	System.out.println(d);
    }
    /*
     * static int abs(int i)
     * 获取参数的绝对值
     */
    public static void function() {
    	int i = Math.abs(-0);
    	System.out.println(i);
    }
}

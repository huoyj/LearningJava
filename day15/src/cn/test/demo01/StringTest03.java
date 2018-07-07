package cn.test.demo01;

public class StringTest03 {
    public static void main(String[] args) {
		function();
		function2();
		functon3();
		function4();
	}
    
    
    
    public static void function4() {
    	String str = "dfadsfsadfq";
    	int index = str.indexOf('f');//查找一个字符，在字符串中第一次出现的索引
    	System.out.println(index);//如果输出结果为-1，表示不存在
    }
    
    
    public static void functon3() {
    	String str = "aaaewrfd";
    	boolean b = str.startsWith("awa");//判断一个字符串是否是另一个字符串的开头
    	System.out.println(b);
    	boolean c = str.endsWith("d");//判断一个字符串是否是另一个字符串的结尾
    	System.out.println(c);
    	boolean d = str.contains("aae");//按照顺序来的
    	System.out.println(d);
    	
    	
    }
    /*
     * String substring(int beginIndex,int endIndex)获取字符串的一部分
     * 返回新的字符串
     * 包含头不包含尾
     * 
     * String substring(int beginIndex)获取字符串一部分
     * 包含头，后面的字符全要
     */
    public static void function2() {
    	String str = "sdfweq2344adafds";
    	String s = str.substring(1,5);
    	System.out.println(s);
    	System.out.println(str);
    	String d = str.substring(2);
    	System.out.println(d);
    }
    
    
    
    
    /*
     * int length() 返回字符串长度
     * 包含多少个字符
     */
    public static void function() {
    	String str = "safdsfwefgad3w";
    	int length = str.length();
    	System.out.println(length);
    }
}

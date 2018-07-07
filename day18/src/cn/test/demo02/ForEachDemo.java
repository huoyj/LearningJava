package cn.test.demo02;
/*
 * JDK 1.5新特性，增强for循环
 * 
 */
import java.util.ArrayList;

/*
 * JDK 1.5特性 增强for 循环
 * JDK 1.5之后出现新接口，java.lang.Iterable
 *    Collection 继承Iterable
 *    Iterable 作用，实现增强for循环
 *    格式：
 *    for(数据类型 变量名：数组或者集合)
 *        {
 *        sop（变量）;}
 */
import cn.test.demo01.Person;
public class ForEachDemo {
    public static void main(String[] args) {
		function1();
	}
    /*
     * 遍历person类
     */
    
    public static void function1() {
    	ArrayList<Person> array = new ArrayList<Person>();
    	array.add(new Person("nnamm","33"));
    	Person p = new Person("qwe","22");
    	array.add(p);
    	
    	for (Person pe:array) {
    		System.out.println(pe);//在输出语句中是变量对象，调用toString方法
    	}
    }
    /*
     * 遍历数组
     * 好处：减少代码，方便遍历
     * 弊端：没有索引，不能操作容器里的数据
     */
    public static void function() {
    	int[]  arr = {22,12,13,43};
    	for(int i:arr) {
    		System.out.println(i+1);
    	}
    	System.out.println(arr[0]);
    	
    	
    	String[]  s = {"qq","12a","ll"};
    	for(String a:s) {
    		System.out.println(a);
    		System.out.println(a.length());
    	}
    }
}

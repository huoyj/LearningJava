package cn.test.demo01;

import java.util.ArrayList;
import java.util.Collection;
/*
 * ArrayList implements List
 * List extends Collection
 */
public class CollectionDemo {
    public static void main(String[] args) {
		function3();
	}
    /*
     * boolean remove(Object o)移除集合中指定的元素
     * 删除第一个遇到的o
     */
	private static void function3() {
		Collection<String> coll = new ArrayList<String>();
		coll.add("22");
		coll.add("s");
		coll.add("we13");
		coll.add("wwww");
		coll.add("eeee");
		coll.add("we13");
		System.out.println(coll);
		boolean b = coll.remove("we13");
		System.out.println(b);
		System.out.println(coll);
		
		
		
	}

	/*Collection接口方法
      *Object[] toArray() 集合中的元素，转成一个数组中的元素，集合转数组
      */
    private static void function2() {
    	Collection<String> coll = new ArrayList<String>();
		coll.add("22");
		coll.add("s");
		coll.add("we13");
		Object[] obj = coll.toArray();
		for (int i=0 ;i <obj.length;i++) {
			System.out.println(obj[i]);
		}
		
	}
    
    /*
     * java 中三种获取长度的表现形式
     * 数组.length 是属性  返回值int
     * 字符串.length()  是方法 返回值int
     * 集合.size()  是方法  返回值int
     */
    /*
     * boolean contains (Object o)判断对象是否存在于集合中，对象存在返回true
     * 方法参数是Object类型
     * 集合可以存任意引用类型变量
     */
    private static void function1() {
		Collection<String> coll = new ArrayList<String>();
		coll.add("22");
		coll.add("s");
		coll.add("we13");
		boolean b = coll.contains("22");
		System.out.println(b);
	}
	
    
    /*
     * void clear() 清空集合中的所有元素
     * 集合容器本身依然存在
     */
    public static void function() {
    	//接口多态的方式调用
    	Collection<String> coll = new ArrayList<String>();
    	coll.add("qqq");
    	coll.add("rrr");
    
    	System.out.println(coll);
    	coll.clear();
    	System.out.println(coll);
    }
}

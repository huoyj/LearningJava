package cn.test.demo01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/*
 * 集合中的迭代器
 *   获取集合中元素的方式
 * 接口Iterator：两个抽象方法
 *  boolean hasNext()判断集合中还有没有可以被选取出的元素，如果有返回true
 *  next() 取出集合中的下一个元素
 * 
 * Iterator 接口的实现类
 *    Collection 接口定义方法
 *      Iterator iterator()
 *     ArrayList 重写方法iterator()，返回了Iterator接口的实现类的对象
 *     
 *     Iterator<Object> it = array.iterator()
 *     
 */
public class IteratorDemo {
    public static void main(String[] args) {
		Collection<String> coll = new HashSet<String>();
		coll.add("wwww1");
		coll.add("wwww2");
		coll.add("wwww3");
		coll.add("wwww4");
		
		Iterator<String> it = coll.iterator();
		//接口实现类对象，调用hasNext()判断集合中是否有元素
        //boolean b = it.hasNext();
        //System.out.println(b);
        //接口实现类对象，调用方法next()取出集合中的元素
        //String s =  it.next();//nexit()指针才移动
        //System.out.println(s);
        //迭代是反复内容，使用循环实现，循环的条件，集合中没有元素，hasNext()返回了false
        while(it.hasNext()) {
        	String s = it.next();
        
        	System.out.println(s);
        	}
        System.out.println("===============================================");
        //for方法比while 节约内存，for循环结束it2结束，while则需要main方法结束才结束
        for(Iterator<String> it2 = coll.iterator();it2.hasNext();) {
        	System.out.println(it2.next());
        }
	}
    
    
}

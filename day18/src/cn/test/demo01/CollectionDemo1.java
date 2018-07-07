package cn.test.demo01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo1 {
    public static void main(String[] args) {
		//集合可以存储任意类型的对象，不指定存储的数据类型则什么类型的都存
    	Collection coll = new ArrayList();
    	coll.add("1qw");
    	//coll.add(2);
    	//coll.add(2.34);
    	coll.add("e");
    	Iterator it = coll.iterator();
    	
    	while(it.hasNext()) {
    		//Object o = it.next();
    		//System.out.println(o);
    		String s = (String)it.next();//不加数据类型，不能调用子类特有的功能，应该加上数据类型
    		System.out.println(s.length());
    	}
    	
	}
}

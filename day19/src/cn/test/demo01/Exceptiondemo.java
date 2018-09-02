package cn.test.demo01;

import java.util.ArrayList;
import java.util.Iterator;
/*
 * 迭代器并发修改异常：java.util.ConcurrentModificationException
 * 
 * 就是在遍历过程中，使用集合方法，修改长度是不允许的
 */
public class Exceptiondemo {
    public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		array.add("qqq");
		array.add("eee");
		array.add("rrr");
		array.add("aaa");
		array.add("sss");
		array.add("ddd");
		/*
		Iterator<String> it = array.iterator();
		while (it.hasNext()) {
            String s = it.next();
            if(s.equals("eee")) {
//            	array.add("EEE");//java.util.ConcurrentModificationException
            	array.set(3, "ppp");
            }
            System.out.println(s);
		}
System.out.println("================================================");	
*/	
		int[] arr = {11,22,33};
		int[] arr2 = {44,55,44};
		System.out.println(arr);
		for (int j = 0 ; j<arr.length;j++) {
			if (arr[1] == 22) {
				arr[1]=2;
			arr.
			}
			System.out.println(arr[j]);
		}
/*	 
		for (int i = 0 ; i <array.size();i++) {
			if (array.get(i) == "qqq") {
				array.add("uuu");//java.util.ConcurrentModificationException
//				System.out.println("array[2]is"+array.get(0));
			}
			System.out.println(array.get(i));
		}
		  */	
    System.out.println("================================================");	
  
		for(String s:array) {
			if (array.get(0) == "qqq") {
				array.add("ttt");//java.util.ConcurrentModificationException
				System.out.println("array[2]is"+array.get(0));
			}
			System.out.println(s);
		}
		
	}
}

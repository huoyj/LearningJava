package cn.test.demo01;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(22);
		array.add(11);
		array.add(34);
		for (int i = 0 ;i<array.size();i++) {
			System.out.println(array.get(i));
		}
		
		ArrayList<Person> arr = new ArrayList<Person>();
		
		Person p = new Person("zhangs","44");
		arr.add(0,p);
		arr.add(new Person("lil","22"));
		arr.add(new Person("liwl","12"));
		arr.add(new Person("lwril","23"));
		/*
		for(int j = 0 ; j<arr.size();j++) {
			System.out.println(arr.get(j));
		}
		*/
		System.out.println("======================================");
		arr.add(p);
		for(int m = 0 ; m<arr.size();m++) {
			System.out.println(arr.get(m));
		}
		
		
	}
	
	
}

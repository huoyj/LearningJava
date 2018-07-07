package cn.test.demo04;

import java.util.Arrays;

/*
 * 数组的工具类，包含数组的操作
 * java.util.Arrays
 */

public class ArraysDemo {
	public static void main(String[] args) {
		function2();
		int[] arr = {22,55,76,34,89};
		int[] a = test(arr);
		System.out.println(Arrays.toString(a));
	}
	/*
	 * 定义方法，接收数组输入，存储的是10个人的考试成绩
	 * 将最后三个人的成绩，存储到新的数组中，返回新的数组
	 */
	public static int[] test(int[] arr) {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int[] result = new int[3];
		System.arraycopy(arr,arr.length-3, result, 0, 3);
		return result;
		
		
	}
	/*
	 * static String toString(数组)
	 * 将数组变成字符串
	 */
	public static void function2() {
		int[] arr = {3,5,1,6,89,7};
		String s = Arrays.toString(arr);
		System.out.println(s);
	}
	/*
	 * static int binarySearch(有序的数组，被查找的元素)
	 * 数组的二分搜索法
	 * 返回元素在数组中出现的索引
	 * 元素不存在，返回的是  ：（-插入点/索引-1）
	 */
	
	public static void function1() {
		int[] arr = {1,4,7,9,11,33,55};
		int index  = Arrays.binarySearch(arr,55);
		System.out.println(index);
	}
	/*
	 * static void sort(数组)
	 * 对数组升序排列
	 */
	public static void function() {
		int[] arr = {1,5,2,9,5,2};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		for (int i = 0 ;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}

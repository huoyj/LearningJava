package cn.test.demo02;

public class StringBufferDemo {
	public static void main(String[] args) {
		int[] arr = {1,33,21,90};
		System.out.println(arr[3]);
		//tString(arr);
		System.out.println(tString(arr));
	}
	
	public static String tString(int[] arr) {
		//创建字符串缓冲区
		StringBuffer buffer = new StringBuffer();
		buffer.append("[");
		for (int i = 0 ; i < arr.length;i++) {
			if( i == arr.length-1) {
				buffer.append(arr[i]).append("]");
			}else {
				buffer.append(arr[i]).append(",");
			}
			
		}
		//System.out.println(buffer);
		return buffer.toString();
	}
}

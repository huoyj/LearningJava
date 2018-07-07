package cn.test.demo01;

public class StringTest {
	public static void main(String[] args) {
		String str = "test";//不需要new，str：引用类型的变量，“test”是对象
		
		System.out.println(str);//String重写了toString，继承了Object
		str = "TEST";
		System.out.println(str);
		
		//str 引用变量指向的内存发生了变化
		//定义好的字符串对象“test”，“TEST”不变
	}

}

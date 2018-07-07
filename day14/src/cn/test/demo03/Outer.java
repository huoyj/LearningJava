package cn.test.demo03;
/*
 * 局部内部类$1
 * new一个内部类对象，进行调用
 */
public class Outer {
	
	public void out() {
		class Inner{
			public void inner() {
				System.out.println("局部内部类方法");
			}
		}
		Inner in = new Inner();
		in.inner();
	}

}

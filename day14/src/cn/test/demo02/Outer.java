package cn.test.demo02;
/*
 * 内部类
 * 同名变量的调用
 */
public class Outer {
	private int a = 10;
	
	class Inner{
		private int a = 20;
		public void inner() {
			int a = 30;
			System.out.println("内部类方法inner中的a变量："+a);
			System.out.println("内部类的a变量值："+this.a);
			System.out.println("外部类a变量值："+Outer.this.a);
		}
	}
}

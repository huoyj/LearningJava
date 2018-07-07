package cn.test.demo02;

public class Test {
	public static void main(String[] args) {
		/*格式：
		 * 外部类名.内部类名 变量 = new 外部类对象().new 内部对象();
		 */
		Outer.Inner o = new Outer().new Inner();
		o.inner();
	}
}

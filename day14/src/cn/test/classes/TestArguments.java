package cn.test.classes;
/*
 * 类作为方法参数
 */
public class TestArguments {
	
	public static void main(String[] args) {
		Person p = new Person();
		method(p);
	}
	
	public static void method(Person p) {
		p.eat();
		p.run();
	}

}

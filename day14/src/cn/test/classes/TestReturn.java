package cn.test.classes;
/*
 * 类作为返回值
 */
public class TestReturn {
	public static void main(String[] args) {
		GetPerson g = new GetPerson();
		Person p = g.get();
		p.eat();
		p.run();
	}
}

package cn.test.demo01;

public class Test {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.name = "Davide";
		p2.className= "three";
		System.out.println(p1.name);
		
		System.out.println(p2.className);
		System.out.println(Person.className);
	}

}

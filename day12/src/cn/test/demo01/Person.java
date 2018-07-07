package cn.test.demo01;
/*
this可以在构造方法之间进行调用
this.方法，区分局部变量和成员变量同名情况
this()，在构造方法之间调用，只能写在第一行
减少代码编写量

 */
public class Person {
	
	private String name;
	private int age;
	
	public Person() {
	//调用了有参数的构造方法，并传递了参数
		this("lili");
	}
	public Person(String name) {
		this.name = name;
	}
	
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
}

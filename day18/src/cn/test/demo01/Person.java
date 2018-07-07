package cn.test.demo01;

public class Person {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	private String age;
	@Override
	public String toString() {
		//return "Person [name=" + name + ", age=" + age + "]";
		return name+"   "+age;
	}
	//public Person() {}
	public Person(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	
}

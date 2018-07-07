package cn.test.demo02;
/*final修饰成员变量，成员变量，在堆内存，具有默认值
final不是固定的默认值，而是成员变量的手动赋值，绝对不是内存的默认
成员变量赋值，2中实现方式，一种是定义的时候，直接赋值；另一种，采用构造方法赋值(只能赋值一次)
成员变量，需要在创建对象前赋值，否则报错。
构造方法，是在创建对象中的事情，可以为成员变量赋值
setxxx方法，是创建对象之后运行的，不能为final 修饰的成员赋值
 
 */
public class Person {
	final int i ;
	public Person(int i) {
		this.i = i;
	}
	
	final int aa = 22;
	    
}

package cn.test.demo03;

public class Test {
    public static void main(String[] args) {
		JavaEE j = new JavaEE("Davide","研发部001");
		j.work();
		
		Android an = new Android("Peter","研发部008");
		an.work();
		
		Net net = new Net("Peter","运维部009");
		net.work();
	}
}

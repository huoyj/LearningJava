package cn.test.demo03;

public class JavaEE extends Developer {
	public JavaEE (String name,String id) {
		super(name, id);
	}
	
	public void work() {
		System.out.println("JavaEE工程师"+"..."+getName()+"..."+getId()+"..."+"在进行研发工作");
	}

}

package cn.test.demo03;

public class Android extends Developer {
	public Android (String name,String id) {
		super(name, id);
	}
	public void work() {
		System.out.println("Android工程师"+"..."+getName()+"..."+getId()+"..."+"在开发前端app");
	}

}

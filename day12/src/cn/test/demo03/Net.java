package cn.test.demo03;

public class Net extends Maintrainer{
	public Net (String name,String id) {
		super(name, id);
	}
	public void work() {
		System.out.println("运维工程师"+"..."+getName()+"..."+getId()+"..."+"在查看网络是否通畅");
	}

}

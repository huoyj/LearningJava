package cn.test.demo03;
//匿名内部类,简化了以往的实现类，重写方法，new对象过程。
public class Test2 {
	public static void main(String[] args) {
		/*
		 * 必须有继承父类，or，实现接口，否则无法多态
		 * 
		 * 格式：
		 *  new 接口或者父类(){
		 *  重写抽象方法
		 *  };
		 *  从new开始，到分号结束，创建了接口的实现类对象
		 */
		
		new Smoking() {
			public void smoking() {
				System.out.println("xiyan");
			}
		}.smoking();
		
	}

}

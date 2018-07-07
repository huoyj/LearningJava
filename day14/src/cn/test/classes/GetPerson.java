package cn.test.classes;
/*
 * 类作为返回值调用
 */
public class GetPerson {
	
	public Person get() {
		
		/*
		 * Person p = new Person();
		 
		return p;
		*/
		return new Person();
	}

}

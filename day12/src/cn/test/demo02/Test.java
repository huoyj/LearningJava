package cn.test.demo02;

public class Test {
    public static void main(String[] args) {
	    Worker w = new Worker("David",11);
	    System.out.println(w.getName());
	    System.out.println(w.getAge());
	    
	    Student s = new Student("Peter",12);
	    System.out.println(s.getName());
	    System.out.println(s.getAge());
    }
}

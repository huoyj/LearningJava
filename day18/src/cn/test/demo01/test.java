package cn.test.demo01;

public class test {
    public static void main(String[] args) {
		String[] arr = new String[3];
		arr[0]="11";
		System.out.println(arr[0]);
		Person[] arr1 = new Person[2];
		Person p = new Person("ww","11");
		arr1[0] = new Person("qq","11");
		arr1[1] = p;
		System.out.println(arr1[1]);
	}
}

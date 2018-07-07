package cn.test.demo02;

public class test {
	public static void main(String[] args) {
		   int a = 5;
	        byte b = 98;
	        char d = 'a';
	        int c = a + b;
	        System.out.println(c);//byte自动转换为int
	         int z = d ;
	        System.out.println(z);//char自动换行为int
	        
	        /*char cc = b;
	        System.out.println(cc);
	        */
	        
	        byte[] bys = new byte[]{97,98,99,100};
	    	String s2 = new String(bys);
	    	System.out.println(s2);
	    	
	    	char[] chs = new char[]{'2','2'};
	    	String s4 = new String(chs);
	    	System.out.println(s4);
	    	
	    	int ii = 98;
	    	char ccc = (char)ii;
	    	System.out.println(ccc);

	}
}

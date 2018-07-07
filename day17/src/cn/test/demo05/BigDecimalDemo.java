package cn.test.demo05;

import java.math.BigDecimal;

public class BigDecimalDemo {
    public static void main(String[] args) {
		function1();
	}
    public static void function () {
    	BigDecimal big = new BigDecimal("0.09");
    	BigDecimal big2 = new BigDecimal("0.01");
    	BigDecimal bigadd = big.add(big2);
    	System.out.println(bigadd);
    	BigDecimal bigSub = big.subtract(big2);
    	System.out.println(bigSub);
    	
    	BigDecimal bigMul = big.multiply(big2);
    	System.out.println(bigMul);
    }
    
    public static void function1() {
    	BigDecimal b1 = new BigDecimal("1.500");
    	BigDecimal b2 = new BigDecimal("100");
    	
    	BigDecimal bigDiv = b1.divide(b2, 2, BigDecimal.ROUND_HALF_UP);//四舍五入
    	BigDecimal bigDiv2 = b1.divide(b2, 2, BigDecimal.ROUND_DOWN);//全部舍弃，截断了
    	BigDecimal bigDiv3 = b1.divide(b2, 2, BigDecimal.ROUND_FLOOR);//同down
    	BigDecimal bigDiv4 = b1.divide(b2, 2, BigDecimal.ROUND_UP);//向上+1
    	BigDecimal bigDiv5 = b1.divide(b2, 2, BigDecimal.ROUND_HALF_DOWN);// >5时向上+1，其他舍弃

    	


    	System.out.println(bigDiv4+" "+bigDiv5);
    }
    
}

package cn.test.demo02;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * DateFormat类方法parse
 * 将字符串解析为日期对象
 * Date parse(String s) 字符串变成日期对象
 * String =>Date parse
 * Date => String format
 */
public class SimpleDateFormatDemo {
    public static void main(String[] args)throws Exception {
    	function();
    }
    /*
     * 将字符串转成Date对象
     * DateFormat类方法parse
     * 步骤：
     * 1，创建子类SimpleDateFormat的对象
     *   构造方法中，指定日期模式
     * 2，子类对象，调用方法parse 传递String，返回Date
     * 注意：
     *    yyyy-MM-dd 必须和字符串中的时间日期匹配
     *    日期不能输入，只能选择，日期控件
     */
    
    
    public static void function()throws Exception {
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy:MM:dd:HH");
    	
    	String s = "2061:09:09:08:08:08";
    	Date d = sdf.parse(s);
    	System.out.println(d);
    	
    	
    }
    
    
}

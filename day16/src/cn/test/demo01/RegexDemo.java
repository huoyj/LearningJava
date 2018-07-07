package cn.test.demo01;
/*
 * 实现正则规则和字符串进行比配，使用到字符串类的方法
 * String类三个和正则表达式相关的方法
 *  boolean matches(String 正则的规则)
 *   "abc".matches("[a]") 匹配成功返回true
 *   
 *  String[] split(String 正则的规则)
 *   "abc".split("[a]")使用规则将字符串进行切割
 *   
 *   String replaceAll(String 正则规则,String 字符串)
 *   按照正则的规则替换字符串
 *   "aaa999wqqq".replaceAll("[\\d]","$")
 */
public class RegexDemo {
	public static void main(String[] args) {
		checkQQ();
		checkTel();
		
	}
	
	/*
	 * 检查手机号码是否合法
	 * 1开头，第二位 34578 ，第三位0-9 位数11位
	 */
	public static void checkTel() {
		String tel = "13411111110";
		boolean b = tel.matches("1[34785][\\d]{9}");//34578无顺序关系
		System.out.println(b);
		
				
	}
	/*
	 * 检查QQ号码是否合法
	 * 0不能开头，全是数字，位数5-10位
	 * \\d匹配是数字的   \\D匹配不是数字的
	 */
	
	public static void checkQQ() {
		String QQ = "219090l431111";
		boolean b =QQ.matches("[1-9][\\d]{4,9}");
		System.out.println(b);
	}
	
}

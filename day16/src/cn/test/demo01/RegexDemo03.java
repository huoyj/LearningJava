package cn.test.demo01;
//邮箱地址验证
public class RegexDemo03 {
	public static void main(String[] args) {
		checkEmai();
	}
	
	/*
	 * 123@qq.com   aaa_@163.com  kkkk@sina.com  wojlkf@yahoo.com.cn
	 * 规则：
	 * @前：数字 字母 下划线 不少于1个
	 * @后：数字 字母 不少于1个
	 * .后：字母 不少于1个
	 */
	
	public static void checkEmai() {
		String email = "1111@qq.com.cn";
		boolean E = email.matches("[a-zA-Z0-9_]+@[a-z0-9]+(\\.[a-z]+)+");
		System.out.println(E);
	}
}

package cn.test.demo02;

public class StringTest {
	public static void main(String[] args) {
		String str = "hellojava,nihjavaaojava,javazhenbang";
		char[] ch = str.toCharArray();
		System.out.println(ch);
		byte[] by = str.getBytes();
		System.out.println(by);
		
		getCount(str);
		System.out.println(toConvert(str));
		
		System.out.println(getNum(str,"java"));
		
	}
	
	/*
	 * 查询字符串中，出现java的次数
	 * 思路:
	 *  1,indexOf()查询出第一次出现的索引
	 *  2，找到的索引+被查找字符串的长度，获取新字符串
	 *  3，次数++
	 */
	
	public static int getNum(String str,String key) {
		int count = 0;
		int index = 0;
		
		while ((index = str.indexOf(key)) != -1) {
			count++;
			str = str.substring(index+key.length());
		}
		return count;
	}
	/*
	 * 将字符串首字母转换成大写，其他转换成小写
	 * 思想：
	 *  1，获取首字母，charAt(0)，substring(0,1)
	 *  转换成大写toUpperCase()
	 *  
	 *  2，获取剩余字符串，substring(1) toLowerCase()
	 */
	
	public static String toConvert(String str) {
		String first = str.substring(0,1);
		String after = str.substring(1);
		
		first = first.toUpperCase();
		after = after.toLowerCase();
		
		return first+after;
		
	}
	/*
	 * 获取指定字符串中，大写字母，小写字母，数字的个数
	 * 思想：
	 * 	1，计数器，就是int类型，满足一个条件然后++
	 *  2，遍历字符串，长度方法length（）+charAt（）遍历
	 *  3，字符判断是大写还是小写，还是数字
	 */
	public static void getCount(String str) {
		int bigCount = 0;
		int smallCount = 0;
		int numCount = 0;
		for (int i = 0 ;i<str.length();i++) {
			//charAt方法，根据索引获取字符
			char c = str.charAt(i);
			//System.out.println(c);
			//利用编码表，65-90大写，97-122 小写，48-57 数字
			if (c>='A' && c<='Z') {
			//c>=65 && c<=90,两种方式一样，都是在>=号时先用表转换成int
				bigCount++;
			}else if(c >='a' && c<='z') {
				smallCount++;
			}else if(c >='0' && c <='9'){
				numCount++;
			}
			
		}
		System.out.println(bigCount);
		System.out.println(smallCount);
		System.out.println(numCount);
	}
	
}

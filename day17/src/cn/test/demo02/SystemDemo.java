package cn.test.demo02;
/*
 * currentTimeMillis()
 * gc()
 * exit(0)
 */
public class SystemDemo {
    public static void main(String[] args) {
		function1();
	}
    /*
     * System类方法，复制数组
     * arraycopy(Object src,int srcPos,Object dest,int destPos,int length)
     * Object src：要复制的源数组
     * int srcPos：数组源的起始索引
     * Object dest：复制后的目标数组
     * int destPos：目标数组的起始索引
     * int length：要复制的数组元素个数
     * 
     */
    public static void function1() {
    	int[] src = {11,22,33,44};
    	int[] desc = {77,12,33,0};
    	System.arraycopy(src, 0, desc, 0, 3);//native 本地方法，保密
    	for(int i = 0 ;i<desc.length;i++) {
    		System.out.println(desc[i]);
    	}
    }
    /*
     * 获取当期操作系统的属性
     */
    public static void function() {
    	System.out.println(System.getProperties());
    }
}

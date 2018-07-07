package cn.test.demo05;
/*
 * 定义长方形类
 * 面积和周长
 */
public class CFX {
	private int w ;
	private int h ;
/*
	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}
*/
	public CFX(int w,int h) {
		this.w = w;
		this.h = h;
		
	}
	
	public int getArea() {
		return w*h;
		
	}

}

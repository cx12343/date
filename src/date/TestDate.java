package date;

import java.util.Date;

public class TestDate {
	public static void main(String[] args) {
		long t = System.currentTimeMillis();//当前时间数 
		System.out.println(t);
		Date d= new Date();//新建一个时间  默认当前时间
		System.out.println(d);
		Date d2= new Date(1000);//把数字变成时间 1970.1.1.00开始
		System.out.println(d2);
		System.out.println(d2.getTime());//把时间变成数字
	}
}

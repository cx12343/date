package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDataFormat {
public static void main(String[] args) {
	SimpleDateFormat aa= new SimpleDateFormat("yyyy年mm月dd日");//定义格式
	Date d = new Date(12345664352115L);//定义时间
	String str = aa.format(d);//转为对于格式的字符串
	
	System.out.println(str);
	String a = "2017-11-12";
	SimpleDateFormat bb =new SimpleDateFormat("yyyy-mm-dd");////定义格式 格式 一定要与被转时间一致
	
	try {
		
		Date z=bb.parse(a);//字符串转为时间
		System.out.println(z);
		String dd=aa.format(z);//时间转为字符串
		System.out.println(dd);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}

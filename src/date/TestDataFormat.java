package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDataFormat {
public static void main(String[] args) {
	SimpleDateFormat aa= new SimpleDateFormat("yyyy��mm��dd��");//�����ʽ
	Date d = new Date(12345664352115L);//����ʱ��
	String str = aa.format(d);//תΪ���ڸ�ʽ���ַ���
	
	System.out.println(str);
	String a = "2017-11-12";
	SimpleDateFormat bb =new SimpleDateFormat("yyyy-mm-dd");////�����ʽ ��ʽ һ��Ҫ�뱻תʱ��һ��
	
	try {
		
		Date z=bb.parse(a);//�ַ���תΪʱ��
		System.out.println(z);
		String dd=aa.format(z);//ʱ��תΪ�ַ���
		System.out.println(dd);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}

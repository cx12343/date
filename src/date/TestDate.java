package date;

import java.util.Date;

public class TestDate {
	public static void main(String[] args) {
		long t = System.currentTimeMillis();//��ǰʱ���� 
		System.out.println(t);
		Date d= new Date();//�½�һ��ʱ��  Ĭ�ϵ�ǰʱ��
		System.out.println(d);
		Date d2= new Date(1000);//�����ֱ��ʱ�� 1970.1.1.00��ʼ
		System.out.println(d2);
		System.out.println(d2.getTime());//��ʱ��������
	}
}

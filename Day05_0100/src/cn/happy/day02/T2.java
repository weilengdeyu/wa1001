package cn.happy.day02;

public class T2 {

	public static void main(String[] args) {
		/*2012������ѧԱ25���ˣ�ÿ������25%�����ʰ��������ٶȣ�����һ����ѵѧԱ�������ﵽ100���ˣ�
		 * */
		/*int year=2012;
		double renshu=250000;
		while(renshu<=1000000){
			 renshu=renshu*1.25;
			 year++;
		}
		System.out.println(year);*/
		
		int year=2012;
		int renshu=250000;
		while(renshu<=1000000){
			 renshu=(int)(renshu*1.25);
			 year++;
		}
		System.out.println(year);
		
	}

}

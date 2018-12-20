package cn.happy.day02;

public class T2 {

	public static void main(String[] args) {
		/*2012年培养学员25万人，每年增长25%。请问按此增长速度，到哪一年培训学员人数将达到100万人？
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

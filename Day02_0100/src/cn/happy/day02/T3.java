package cn.happy.day02;

public class T3 {

	public static void main(String[] args) {
		//����������46������������ʣ�������
		int day=46;
		int weekday=7;
		int jizhou=day/weekday;

		System.out.println(jizhou);
		
		int shengyu=day-(jizhou*weekday);
		
		System.out.println(shengyu);
	
		
	}

}

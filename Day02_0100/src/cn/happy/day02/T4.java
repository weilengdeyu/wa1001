package cn.happy.day02;

public class T4 {

	public static void main(String[] args) {
		//根据天数（46）计算周数和剩余的天数
		int day=46;
		int weekday=7;
		int jizhou=day/weekday;

		System.out.println(jizhou);
		
		int shengyu=day%weekday;
		System.out.println(shengyu);
		
		
		
	}

}

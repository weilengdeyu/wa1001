package cn.happy.day01;

import java.util.Scanner;

public class T3 {

	public static void main(String[] args) {
		for (int i = 1; i <=4; i++) {
			for (int j = 1; j <=8; j++) {
				for (int k = 1; k <=4; k++) {
					for (int z = 1; z <=3; z++) {
						System.out.println("这是"+i+"层"+j+"教室的第"+k+"个同学的第"+z+"根头发");
					}
				}
			}
			System.out.println("===================================");
		}
		
		
		
		
		//关于几层几教室 
		/*for (int i = 1; i <=4; i++) {
			for (int j = 1; j <=8; j++) {
				System.out.println("这是"+i+"层"+j+"教室");
			}
			System.out.println("===================================");
		}*/
		
		/*Scanner input=new Scanner(System.in);
		//1.用变量i代表班级名称   
		for (int i = 1; i <=3; i++) {
		   int sum=0;//四位同学的总成绩
		   for (int j= 1; j <=4; j++) {
			  System.out.println("请输入"+i+"年级，第"+j+"位同学的成绩");
			  int score=input.nextInt();
			  sum=sum+score;
		   }
		   int avg=sum/4;
		   System.out.println("第"+i+"班级的学员平均成绩是"+avg);
		}
		*/
		
	  }

}

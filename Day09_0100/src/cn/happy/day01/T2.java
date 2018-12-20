package cn.happy.day01;

import java.util.Scanner;

public class T2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int sum=0;//定义总和变量
		
		for (int i = 1; i <=4; i++) {
			
			System.out.println("请输入第"+i+"位同学的成绩");
			int score=input.nextInt();
			sum=sum+score;
			
		}
		int avg=sum/4;
		System.out.println("平均成绩是"+avg);
		


	}

}

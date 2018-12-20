package cn.happy;

import java.util.Scanner;

public class T2 {

	public static void main(String[] args) {
		// 循环输入某同学S1结业考试的5门课成绩，并计算平均分
		Scanner input=new Scanner(System.in);
		System.out.println("请输入王二狗同学的3门课程的成绩");
		
		int firstCourseScore = input.nextInt();
	    int secondCourseScore=input.nextInt();
	    int thirdCourseScore=input.nextInt();
	    
	    //总成绩
	    int totalScore=firstCourseScore+secondCourseScore+thirdCourseScore;
	    
	    //平均分
	    int avgScore=totalScore/3;
	    
	    System.out.println("平均分是"+avgScore);
	    

	}

}

package cn.happy;

import java.util.Scanner;

public class T6 {

	public static void main(String[] args) {
	    
	  Scanner input=new Scanner(System.in);
	  int[] scores=new int[3];
      //接收用户从键盘上录入的3个成绩，求平均分
	  //循环作业将从 键盘上接收到的成绩  ，依次放入  数组 对应的位置
	  for (int i = 1; i <=3; i++) {
		 System.out.println("请输入第"+i+"位学员的成绩");
		 scores[i-1]=input.nextInt();
	  }
	  int sum=0;
	  for (int i = 0; i < scores.length; i++) {
		 sum=sum+scores[i];
	  }
	  int avg=sum/scores.length;
	  System.out.println("平均分为"+avg);
	  
	}

}

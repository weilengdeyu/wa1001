package cn.happy.day03;

import java.util.Scanner;

public class T1 {
     //求最大值和最小值。
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] scores=new int[5];
		//循环专门赋值的
		for (int i = 0; i <scores.length; i++) {
			System.out.println("请输入第"+(i+1)+"位同学的成绩");
			scores[i]=input.nextInt();
		}
		//专门求最大值的
		int min=scores[0];
		for (int i = 1; i <scores.length; i++) {
			if (scores[i]<min) {
				min=scores[i];
			}
		}
		System.out.println("最小值为"+min);
	}

}
















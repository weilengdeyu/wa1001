package cn.happy.day02;

import java.util.Scanner;

public class T2 {

	public static void main(String[] args) {
		Process process=new Process();
	
		int[] num=new int[5];
		Scanner input=new Scanner(System.in);
		for (int i = 0; i < num.length; i++) {
			System.out.println("�������"+(i+1)+"λѧ���ĳɼ�");
			num[i]=input.nextInt();
		}
		
		
		int avg = process.avgScore(num);
		int maxValue = process.getMaxFromArray(num);
		System.out.println(avg);
		System.out.println(maxValue);

	}

}

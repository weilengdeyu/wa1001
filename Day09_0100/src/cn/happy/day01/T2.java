package cn.happy.day01;

import java.util.Scanner;

public class T2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int sum=0;//�����ܺͱ���
		
		for (int i = 1; i <=4; i++) {
			
			System.out.println("�������"+i+"λͬѧ�ĳɼ�");
			int score=input.nextInt();
			sum=sum+score;
			
		}
		int avg=sum/4;
		System.out.println("ƽ���ɼ���"+avg);
		


	}

}

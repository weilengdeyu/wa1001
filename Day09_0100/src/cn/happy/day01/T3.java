package cn.happy.day01;

import java.util.Scanner;

public class T3 {

	public static void main(String[] args) {
		for (int i = 1; i <=4; i++) {
			for (int j = 1; j <=8; j++) {
				for (int k = 1; k <=4; k++) {
					for (int z = 1; z <=3; z++) {
						System.out.println("����"+i+"��"+j+"���ҵĵ�"+k+"��ͬѧ�ĵ�"+z+"��ͷ��");
					}
				}
			}
			System.out.println("===================================");
		}
		
		
		
		
		//���ڼ��㼸���� 
		/*for (int i = 1; i <=4; i++) {
			for (int j = 1; j <=8; j++) {
				System.out.println("����"+i+"��"+j+"����");
			}
			System.out.println("===================================");
		}*/
		
		/*Scanner input=new Scanner(System.in);
		//1.�ñ���i����༶����   
		for (int i = 1; i <=3; i++) {
		   int sum=0;//��λͬѧ���ܳɼ�
		   for (int j= 1; j <=4; j++) {
			  System.out.println("������"+i+"�꼶����"+j+"λͬѧ�ĳɼ�");
			  int score=input.nextInt();
			  sum=sum+score;
		   }
		   int avg=sum/4;
		   System.out.println("��"+i+"�༶��ѧԱƽ���ɼ���"+avg);
		}
		*/
		
	  }

}

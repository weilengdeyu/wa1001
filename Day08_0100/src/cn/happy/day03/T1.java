package cn.happy.day03;

import java.util.Scanner;

public class T1 {
     //�����ֵ����Сֵ��
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] scores=new int[5];
		//ѭ��ר�Ÿ�ֵ��
		for (int i = 0; i <scores.length; i++) {
			System.out.println("�������"+(i+1)+"λͬѧ�ĳɼ�");
			scores[i]=input.nextInt();
		}
		//ר�������ֵ��
		int min=scores[0];
		for (int i = 1; i <scores.length; i++) {
			if (scores[i]<min) {
				min=scores[i];
			}
		}
		System.out.println("��СֵΪ"+min);
	}

}
















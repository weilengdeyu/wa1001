package cn.happy.homework;

import java.util.Scanner;

public class T2 {

	public static void main(String[] args) {
		//��ѭ�� ������������  1��3������һ��������ȷ  ���ζ�������󣬵���ѭ���Ѿ�������������
		Scanner input=new Scanner(System.in);
		//����һ������������ѭ���Ĵ���
		int count=1; 
		for (int i = 1; i <=3; i++) {
			System.out.println("�������û���");
			String uname=input.next();
			
			System.out.println("����������");
			int upwd=input.nextInt();
			if (uname.equals("admin")&&upwd==123) {  //������ȷ
				System.out.println("��ӭ���ǳ��ɹ�");
				break;
			}else{
				System.out.println("������󣬻�ʣ"+(3-i)+"�λ���");
			}
			count++;
		}
		if (count==4) {
			System.out.println("�Բ�����3�ξ��������");
		}
		

	}

}

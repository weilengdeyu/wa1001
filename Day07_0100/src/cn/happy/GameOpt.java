package cn.happy;

import java.util.Scanner;

/**
 * �ϻ���ϰ1������������Ϸƽ̨
 */
public class GameOpt {
	public static void main(String[] args) {
		System.out.println("��ӭ��������������Ϸƽ̨\n");
		System.out.println("��ѡ����ϲ������Ϸ��\n");
		System.out.println("*******************************");
		System.out.println("\t1.������");
		System.out.println("\t2.��ţ");
		System.out.println("\t3.������");
		System.out.println("\t4.������");
		System.out.println("*******************************\n");
		int choice;		//�û�ѡ��
		boolean isRight;	//�����Ƿ���ȷ
		System.out.print("��ѡ���������֣�");
		Scanner input = new Scanner(System.in);
		do{
			isRight = true;
			choice = input.nextInt();
			switch (choice) {
			case 1:
				System.out.println("���ѽ��붷�������䣡");
				break;
			case 2:
				System.out.println("���ѽ��붷ţ���䣡");
				break;
			case 3:
				System.out.println("���ѽ������������䣡");
				break;
			case 4:
				System.out.println("���ѽ������������䣡");
				break;
			default:
				System.out.print("��������������������֣�");
				isRight = false;
				break;
			}
		}while(!isRight);
	}
}

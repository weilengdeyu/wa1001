package cn.happy;

import java.util.Scanner;

/**
 * �ϻ���ϰ3��֧����Ϸ��
 * 
 * 
 */
public class PayGame {
	public static void main(String[] args) {
		System.out.println("����������Ϸƽ̨ > ��Ϸ��֧��\n");

		System.out.println("��ѡ���������Ϸ���ͣ�");
		System.out.println("\t1.����");
		System.out.println("\t2.���о�����");

		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		System.out.println("����������Ϸʱ����");
		int time = input.nextInt();
		int qm = 0;
		switch (choice) {
		case 1:
			if (time > 10) {
				System.out.println("�������������Ϸ��ʱ���ǣ�" + time + "Сʱ,��������5���Ż�");
				qm = (int) (10 * time * 0.5);
				System.out.println("����Ҫ֧��" + qm + "����Ϸ��");
			} else {
				System.out.println("�������������Ϸ��ʱ���ǣ�" + time + "Сʱ,��������8���Ż�");
				qm = (int) (10 * time * 0.8);
				System.out.println("����Ҫ֧��" + qm + "����Ϸ��");
			}
			break;
		case 2:
			if (time > 10) {
				System.out.println("����������о�������Ϸ��ʱ���ǣ�" + time + "Сʱ,��������5���Ż�");
				qm = (int) (20 * time * 0.5);
				System.out.println("����Ҫ֧��" + qm + "����Ϸ��");
			} else {
				System.out.println("����������о�������Ϸ��ʱ���ǣ�" + time + "Сʱ,��������8���Ż�");
				qm = (int) (20 * time * 0.8);
				System.out.println("����Ҫ֧��" + qm + "����Ϸ��");
			}
			break;
		default:
			System.out.print("��Чѡ��");
		}

	}

}

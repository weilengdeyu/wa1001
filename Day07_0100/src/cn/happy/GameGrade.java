package cn.happy;

import java.util.Scanner;

/**
 * �ϻ���ϰ2������Ϸ������
 */

public class GameGrade {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = 1;
		int count = 0; //����
		int score = 0; //��Ϸ�ɼ�
		String answer;
		System.out.println("����������Ϸƽ̨ > ��Ϸ����\n");
		 do{
			System.out.print("���������" + n + "��,�ɼ�Ϊ�� ");
			score = input.nextInt();
			if (score > 80) {
				count++;
			}
			n++;
			if (n > 5) {
				System.out.print("��Ϸ����");
			} else {
				System.out.print("��������һ����(yes/no) ");
				answer = input.next();
				if (answer.equals("no")) {
					System.out.print("���Ѿ���;�˳���Ϸ��");
					break;
				} else {
					System.out.println("������һ��");
				}
			}

		}while (n <= 5);

		double rate = count / 5.0; // ����ﵽ80��֮�ϵı���
		if (n >5) {
			if (rate > 0.9) {
				System.out.println("\n��ϲ��ͨ��һ��");
			} else if (rate > 0.6) {
				System.out.println("\nͨ������������Ŭ����");
			} else {
				System.out.println("\n�Բ�����δ�ܽ������������Ͱ���");
			}
		} else {
			System.out.println("\n�Բ�����δ�ܽ������������Ͱ���");
		}
	}

}

package cn.happy;

import java.util.Scanner;
/**
 * �ϻ���ϰ4��ͳ����Ϸ�����
 *
 */
public class GameDot {
	public static void main(String[] args) {
		 int score; 					// �����
	        int total; 					// ��Ϸ������
	        int num = 0; 					//����ʴ���100����Ϸ����
	        Scanner input = new Scanner(System.in);
	        System.out.println("����������Ϸƽ̨ > ��Ϸ�����\n");

	        for (int i = 0; i < 4; i++) {
	            System.out.print("�������" + (i + 1) + "����Ϸ�ĵ����: ");
	            score = input.nextInt();
	            if (score <= 100) {
	                continue;
	            }
	            num++;
	        }        
	        System.out.println("����ʴ���100����Ϸ����: " + num);
	        double rate =  (double)num / 4 * 100;
	        System.out.println("����ʴ���100����Ϸ��ռ�ı���Ϊ:" + rate + "%");        
	}	
}

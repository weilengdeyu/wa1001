package cn.happy.day02;

import java.util.Scanner;

/**
 * ���Ǽ�����࣬���ǳ����У���Ϸ�У����Ƕ�ս�Ķ���
 * @author Happy
 *
 */
public class Computer {
   public String computername; //���Ե��ǳ�
   public int computerscore;  //���Եĵ÷�
   //дһ�����Գ�ȭ�ķ���
    int showFist(){
	   //��java���򣬿���ͨ�����´������  ϵͳ�Զ��׳� 1-3֮�������� ����ʾ�ŵ��Գ�ȭ��1,2,3
	   int show = (int)(Math.random()*10)%3 + 1;  //�������������ʾ���Գ�ȭ
	   switch (show) {
		case 1:
			System.out.println(computername+"��ȭ������");
			break;
		case 2:
			System.out.println(computername+"��ȭ��ʯͷ");
			break;
		case 3:
			System.out.println(computername+"��ȭ����");
			break;
		default:
			System.out.println("���Է���");
			break;
		}
	   return show;
   }
}

package cn.happy.day02;

import java.util.Scanner;

/**
 * ����һ��Person��   
 * 
 * �������  
 * @author Happy
 *
 */
public class Person {
   //���Ƕ�֪������Ҷ����Լ������ƣ���ս��ʱ���ã��͵÷֣�ͳ�ƶ�ս�����ʱ���ã� 
   public String name; //��ҵ�����
   public int score;//��ҵĵ÷�
   
   public int showFist(){
		  Scanner input=new Scanner(System.in);
		  System.out.println("���ȭ����1������  2��ʯͷ 3���� �������Ӧ���ּ���");
		  int userChuDeQuanTou = input.nextInt();
		  switch (userChuDeQuanTou) {
			  case 1: 
		    	  System.out.println("���ȭ: ����");
		    	  break;
		      case 2:
		    	  System.out.println("���ȭ: ʯͷ");
		    	  break;
		      case 3: 
		    	  System.out.println("���ȭ: ��");
		    	  break;
		 }
		 return userChuDeQuanTou;
   }
}

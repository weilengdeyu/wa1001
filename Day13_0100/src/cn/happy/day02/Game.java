package cn.happy.day02;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

/**
 * ���������Ϸ
 * �ۺϵ�����Һ͵���
 * �ж���Ӯ��ҵ���߼�����������С���˵����
 * ������ս�����ͳ�Ƶȵ�
 * @author Happy
 *
 */
public class Game {
	   Computer computer=new Computer();
	   Person  person=new Person();
	   int count;
   public void start(){
	
	   Scanner input=new Scanner(System.in);
	   //��Ϸ��ʼ�Ľ���
	   System.out.println("===��ӭ����΢������ȭ��Ϸ====");
	   System.out.println("===��ȭ����1������  2��ʯͷ 3���� ====");
	   System.out.println("===��ѡ���ս��ɫ(1�����»�  2������ӱ  3����С��) �����Ӧ�����ּ���====");
	   if (input.hasNextInt()) {
		   //֤�� ����������֣�����һ����1,2,3
		   int userInput = input.nextInt();
		   while (userInput!=1  &&  userInput!=2  && userInput!=3) {
			  System.out.println("��ү���ý�ɫ��δ���ã�����������");
			  userInput = input.nextInt();
		   }
		   //����ִ�е����֤���û��������1,2,3�е�һ��
		  
		switch (userInput) {
			case 1:
				computer.computername="���»�";
				break;
			case 2:
				computer.computername="����ӱ";
				break;
			case 3:
				computer.computername="��С��";
				break;
		}
		System.out.println("��������ҵ�����");
		person.name=input.next();
		//��ӡ��ս˫��������
		System.out.println(person.name+"VS"+computer.computername+"��ս");
		System.out.println("ȷ����ս��(y/n)");
		String isOrNot = input.next();
		int count=0; //�����ս����
		while(isOrNot.equals("y")){
			count++;//ѭ��һ��  +1  �����ս��һ��
			System.out.println("���ȭ��1������  2��ʯͷ 3����");
			int num = input.nextInt();
			switch (num) {
			case 1:
				System.out.println("����ȭ:����");
				break;
			case 2:
				System.out.println("����ȭ:ʯͷ");
				break;
			case 3:
				System.out.println("����ȭ:��");
				break;
			default:
				System.out.println("�Ǻ��գ��������Ϸ��");
				break;
			}
			int computerChuQunResult = computer.showFist();
			//1 ����  2ʯͷ  3��
			//�û�Ӯ   1 3
			if( (num==1 && computerChuQunResult==3) ||(num==2 && computerChuQunResult==1) ||(num==3 && computerChuQunResult==2)  ){
				System.out.println("��ϲ������ʤ��");
				person.score=person.score+1;
			}else if( (num==1 && computerChuQunResult==2) ||(num==2 && computerChuQunResult==3) ||(num==3 && computerChuQunResult==1)){
				System.out.println("������˼���������������ˣ����SB");
				computer.computerscore=computer.computerscore+1;;
			}else{
				System.out.println("�Ǻǣ���Ȼ��ƽ�֣������ڲ���֮��");
			}
			System.out.println("�Ƿ�ʼ��һ��(y/n)");
			isOrNot=input.next();
		}
		//����ִ�е����֤���û��˳���սģʽ����ʼ�������յĽ��ͳ�ƾ�
		System.out.println("--------------------------------------------");
		System.out.println(computer.computername+" VS "+person.name);
		System.out.println("��ս����"+count);
		System.out.println("����\t�÷�");
		System.out.println(person.name+"\t"+person.score);
		System.out.println(computer.computername+"\t"+computer.computerscore);
		if (person.score<computer.computerscore) {
			System.out.println("���ս�������ˣ�������������㣬����Nɪһ���");
		}else if(person.score==computer.computerscore){
			System.out.println("���ս����ƽ�֣������Ҳ���״̬��Ҫ��Ȼ�Ļ���ô����ƽ��");
		}else{
			System.out.println("���ս����Ӯ���Ǻǣ���ʵ��ֻ����һ�㹦��");
		}
	   }else{
		   System.out.println("��ү������������ ��");
	   }   
   }
}

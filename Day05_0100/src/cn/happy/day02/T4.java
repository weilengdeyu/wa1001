package cn.happy.day02;

import java.util.Scanner;

public class T4 {

	public static void main(String[] args) {
		
		
		/*{
			int num=12;
		}
		{
			
			System.out.println(num);
		}
		*/
		
		
		Scanner input=new Scanner(System.in);
		String hasZugoudeMoney="";
		  /*�������ϻ���д������ɣ�
			Ȼ����ʦ����Ƿ�ϸ�������ϸ��������д��
		   * */
		  do{
			  System.out.println("Ŭ��д���룬����Ȣϱ����ҪȢ���˵�ϱ��");
			  System.out.println("Ǯ����������y����n����");
			  hasZugoudeMoney=input.next();
		  }while(!hasZugoudeMoney.equals("y"));
		  
	}

}











package cn.happy.day02;

import java.util.Scanner;

public class T5 {

	public static void main(String[] args) {
	   //����ӷ���
		/* 0+6=6
		 * 1+5=6
		 * 2+4=6
		 * 3+3=6
		 * 4+2=6
		 * 5+1=6
		 * 6+0=6
        ���ݹ۲죬����֪��  �Ӻ� ���  �ı���ֵ ��0��6ÿ�ε���1�� ���Ӻź���ı���ֵ��6��0 ÿ�� �ݼ�һ��  ���������յ�������
        �ǹ̶��ľ���6����
      
		*/
		Scanner input=new Scanner(System.in);
		System.out.println("�ף������ǳ���Ա�ڣ���������һ��������������ְɣ�");
		int num=input.nextInt();
		for(int i=0,j=num;i<=num;i++,j--){
			System.out.println(i+"+"+j+"="+num);
		}
		
		
		
	}

}

package cn.happy.day02;

import java.util.Scanner;

public class T4 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("���˵�����������һ������");
	   //ʵ�����ַ�ת 12345
		int val=input.nextInt();
		while(val!=0){
			int num=val%10;
			System.out.print(num);
			val=val/10;
		}
		
		
	}

}

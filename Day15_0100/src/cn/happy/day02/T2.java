package cn.happy.day02;

import java.util.Scanner;

public class T2 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("��ү��������һ������ɣ�");
		String password = input.next();
		if (password.length()>6) {
			System.out.println("����Ϸ���");
		}else{
			System.out.println("���벻�Ϸ�");
		}
		
	}

}

package cn.happy.day02;

import java.util.Scanner;

public class T4 {

	public static void main(String[] args) {
		String uname="TOM";
		String upwd="1";
		Scanner input =new Scanner(System.in);
		System.out.println("��ү���������û�����");
		String username = input.next();
		System.out.println("��ү�����������룡");
		String password = input.next();
		if (username.equalsIgnoreCase(uname) && password.equals(upwd) ) {
			System.out.println("��¼�ɹ�");
		}else{
			System.out.println("�û��������������");
		}
		
	}

}

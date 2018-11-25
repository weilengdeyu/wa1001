package cn.happy.day02;

import java.util.Scanner;

public class T2 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("大爷，请输入一个密码吧！");
		String password = input.next();
		if (password.length()>6) {
			System.out.println("密码合法啊");
		}else{
			System.out.println("密码不合法");
		}
		
	}

}

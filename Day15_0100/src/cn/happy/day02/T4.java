package cn.happy.day02;

import java.util.Scanner;

public class T4 {

	public static void main(String[] args) {
		String uname="TOM";
		String upwd="1";
		Scanner input =new Scanner(System.in);
		System.out.println("大爷，请输入用户名！");
		String username = input.next();
		System.out.println("大爷，请输入密码！");
		String password = input.next();
		if (username.equalsIgnoreCase(uname) && password.equals(upwd) ) {
			System.out.println("登录成功");
		}else{
			System.out.println("用户名或者密码错误");
		}
		
	}

}

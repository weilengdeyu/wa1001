package cn.happy.homework;

import java.util.Scanner;

public class T2 {

	public static void main(String[] args) {
		//出循环 ，有两个条件  1：3次中有一次输入正确  三次都输入错误，但是循环已经不满足条件了
		Scanner input=new Scanner(System.in);
		//定义一个变量，保存循环的次数
		int count=1; 
		for (int i = 1; i <=3; i++) {
			System.out.println("请输入用户名");
			String uname=input.next();
			
			System.out.println("请输入密码");
			int upwd=input.nextInt();
			if (uname.equals("admin")&&upwd==123) {  //输入正确
				System.out.println("欢迎，登出成功");
				break;
			}else{
				System.out.println("输入错误，还剩"+(3-i)+"次机会");
			}
			count++;
		}
		if (count==4) {
			System.out.println("对不起，您3次均输入错误");
		}
		

	}

}

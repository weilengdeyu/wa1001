package cn.happy.day02;

import java.util.Scanner;

public class T2 {

	public static void main(String[] args) {
		int[] nums={8,4,2,1,23,344,12};
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		System.out.println("mmp---Hello，我是高贵的分割线，谁敢搞我？？？？");
		int sum=0;
		for (int i = 0; i < nums.length; i++) {
			sum=sum+nums[i];
		}
		System.out.println(sum);
		System.out.println("mmp---Hello，我是高贵的分割线，谁敢搞我？？？？");
		
		Scanner input=new Scanner(System.in);
		System.out.println("亲，输入您心里想的一个数字吧！");
		int findNum=input.nextInt(); //4
		//定义一个变量，保存寻找的结果，默认没找到
		boolean flag=false;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i]==findNum) {
				System.out.println("找到了");
				flag=true;
				break;
			}
		}
		if (flag==false) {
			
				System.out.println("没有找到，亲");
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

package cn.happy.day02;

import java.util.Scanner;

public class T5 {

	public static void main(String[] args) {
	   //输出加法表
		/* 0+6=6
		 * 1+5=6
		 * 2+4=6
		 * 3+3=6
		 * 4+2=6
		 * 5+1=6
		 * 6+0=6
        根据观察，我们知道  加号 左侧  的变量值 从0到6每次递增1个 ，加号后面的变量值从6到0 每次 递减一个  。他们最终的运算结果
        是固定的就是6本身
      
		*/
		Scanner input=new Scanner(System.in);
		System.out.println("亲，明天是程序员节，请你输入一个你心里想的数字吧！");
		int num=input.nextInt();
		for(int i=0,j=num;i<=num;i++,j--){
			System.out.println(i+"+"+j+"="+num);
		}
		
		
		
	}

}

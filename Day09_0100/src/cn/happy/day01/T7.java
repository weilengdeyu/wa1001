package cn.happy.day01;

import java.util.Scanner;

public class T7 {
	/**
    	菱形打印
		 *
		***
	   *****
	  *******
	   *****
		***
		 *
解决问题的核心就是求i和j的关系
           行数(i) 			             空格数(j)                      星号(k)
      1                     1                           5
      2                     2                           3
      3                     3                           1
*/
	public static void main(String[] args) {
		
	   while(true){
			System.out.println("亲，请输入一个奇数");
			//5   7
		   Scanner input=new Scanner(System.in);
		   int num=input.nextInt();
		   while(num%2==0){
			   System.out.println("亲，您输入的不是奇数，请重新输入");
			   num=input.nextInt();
		   }
		   int middle=(num+1)/2;
			for (int i = 1; i <=middle; i++) {
				//2.内层循环控制  空格个数  
				for (int j = 1; j<=middle-i; j++) {
					System.out.print(" ");
				}
				//3.控制*号的
				for (int k = 1; k<=2*i-1; k++) {
					System.out.print("*");
				}
				System.out.println();
			}

			
			for (int i = 1; i <=num-middle; i++) {
				//2.内层循环控制  空格个数  
				for (int j = 1; j<=i; j++) {
					System.out.print(" ");
				}
				//3.控制*号的
				for (int k = 1; k<=num-2*i; k++) {
					System.out.print("*");
				}
				System.out.println();
			}

	   }

	}

}

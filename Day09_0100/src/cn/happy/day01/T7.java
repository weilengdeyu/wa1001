package cn.happy.day01;

import java.util.Scanner;

public class T7 {
	/**
    	���δ�ӡ
		 *
		***
	   *****
	  *******
	   *****
		***
		 *
�������ĺ��ľ�����i��j�Ĺ�ϵ
           ����(i) 			             �ո���(j)                      �Ǻ�(k)
      1                     1                           5
      2                     2                           3
      3                     3                           1
*/
	public static void main(String[] args) {
		
	   while(true){
			System.out.println("�ף�������һ������");
			//5   7
		   Scanner input=new Scanner(System.in);
		   int num=input.nextInt();
		   while(num%2==0){
			   System.out.println("�ף�������Ĳ�������������������");
			   num=input.nextInt();
		   }
		   int middle=(num+1)/2;
			for (int i = 1; i <=middle; i++) {
				//2.�ڲ�ѭ������  �ո����  
				for (int j = 1; j<=middle-i; j++) {
					System.out.print(" ");
				}
				//3.����*�ŵ�
				for (int k = 1; k<=2*i-1; k++) {
					System.out.print("*");
				}
				System.out.println();
			}

			
			for (int i = 1; i <=num-middle; i++) {
				//2.�ڲ�ѭ������  �ո����  
				for (int j = 1; j<=i; j++) {
					System.out.print(" ");
				}
				//3.����*�ŵ�
				for (int k = 1; k<=num-2*i; k++) {
					System.out.print("*");
				}
				System.out.println();
			}

	   }

	}

}

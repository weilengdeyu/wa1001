package cn.happy.day04;

import java.util.Scanner;

public class T1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("��ү��������3��������");
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		
		//����a���
		if(a>b&&a>c){
			int temp=a;
			a=c;
			c=temp;
			if(a>b){
				int temp2=a;
				a=b;
				b=temp2;
			}
		}else if(b>c&&b>a){
			int temp=b;
			b=c;
			c=temp;
			if(a>b){
				int temp2=a;
				a=b;
				b=temp2;
			}
		}else if(c>a&&c>b){
			if(a>b){
				int temp2=a;
				a=b;
				b=temp2;
			}
		}
		System.out.println(a+"\t"+b+"\t"+c);

	}

}

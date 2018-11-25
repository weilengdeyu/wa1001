package cn.happy.day02;

import java.util.Scanner;

public class T4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入三个整数：");
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		
		/*if(a>b && a>c){
			int temp=a;
			a=c;
			c=temp;
			if(b>c){
				int temp2=b;
				b=c;
				c=temp2;	
			}
		}
		if(b>a && b>c){
			int temp=b;
			b=c;
			c=temp;
			if(a>c){
				int temp2=a;
				a=c;
				c=temp2;	
			}
		}
		if(c>b && c>a){
			if(a>b){
				int temp2=b;
				b=a;
				a=temp2;	
			}
		}
		
		System.out.println(a+"\t"+b+"\t"+c);*/
		
		if(a>b && a>c){
			int temp=a;
			a=c;
			c=temp;
			if(a>b){
				int temp2=a;
				a=b;
				b=temp2;	
			}
		}else if(b>a && b>c){
			int temp=b;
			b=c;
			c=temp;
			if(a>b){
				int temp2=a;
				a=b;
				b=temp2;	
			}
		}else if(c>b && c>a){
			if(a>b){
				int temp2=a;
				a=b;
				b=temp2;	
			}
		}
		
		System.out.println(a+"\t"+b+"\t"+c);
		

	}

}

package cn.happy.day02;

import java.util.Scanner;

public class T2 {

	public static void main(String[] args) {
		int[] nums={8,4,2,1,23,344,12};
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		System.out.println("mmp---Hello�����Ǹ߹�ķָ��ߣ�˭�Ҹ��ң�������");
		int sum=0;
		for (int i = 0; i < nums.length; i++) {
			sum=sum+nums[i];
		}
		System.out.println(sum);
		System.out.println("mmp---Hello�����Ǹ߹�ķָ��ߣ�˭�Ҹ��ң�������");
		
		Scanner input=new Scanner(System.in);
		System.out.println("�ף��������������һ�����ְɣ�");
		int findNum=input.nextInt(); //4
		//����һ������������Ѱ�ҵĽ����Ĭ��û�ҵ�
		boolean flag=false;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i]==findNum) {
				System.out.println("�ҵ���");
				flag=true;
				break;
			}
		}
		if (flag==false) {
			
				System.out.println("û���ҵ�����");
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

package cn.happy.day02;

import java.util.Arrays;
import java.util.Scanner;

public class T4 {

	public static void main(String[] args) {
		int[] nums={1,11,31,24,8,78,67};
		//1.Ĭ�������е�һ�������ֵ��
		int max=nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i]>max) {
				max=nums[i];
			}
		}
		System.out.println("���������ֵ��"+max);
		
	}

}

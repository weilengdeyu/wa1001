package cn.happy.day02;

import java.util.Arrays;
import java.util.Scanner;

public class T3 {

	public static void main(String[] args) {
		int[] nums={1,11,31,24,8,78};
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		//����ǰ
		Arrays.sort(nums);
		System.out.println("mmp---Hello�����Ǹ߹�ķָ��ߣ�˭�Ҹ��ң�������");
		//�����
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		System.out.println("mmp---Hello�����Ǹ߹�ķָ��ߣ�˭�Ҹ��ң�������");
		for (int i = nums.length-1; i >=0; i--) {
			System.out.println(nums[i]);
		}
	}

}

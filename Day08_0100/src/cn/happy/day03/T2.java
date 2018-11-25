package cn.happy.day03;

import java.util.Arrays;
import java.util.Scanner;

public class T2 {
     //插入算法
	public static void main(String[] args) {
		int[] nums={99,85,82,63,60};
		//升序
		Arrays.sort(nums);
		//1.定义一个长度为6的数组
		int[] newNums=new int[nums.length+1];
		//2.赋值  将旧数组第 i项的值  赋值给新数组第i项目
		for (int i = 0; i < nums.length; i++) {
			newNums[i]=nums[i];
		}
		int num=70;
		int index=newNums.length-1;//给出目标位置
		//3.找位置
		for (int i = 0; i < newNums.length; i++) {
			if (newNums[i]>num) {
				//当前i的值就是num应该占有的位置
				index=i;
				break;
			}
		}
		
		System.out.println(index+"========================");
		//4.元素后移  倒着移
		
		for (int i = newNums.length-1; i >index; i--) {
			newNums[i]=newNums[i-1];
		}
		
		
		//5.给index重新赋值
		newNums[index]=num;
		
		
		//6.打印数组元素
		for (int i = 0; i < newNums.length; i++) {
			System.out.println(newNums[i]);
		}
		
		
		
	}

}
















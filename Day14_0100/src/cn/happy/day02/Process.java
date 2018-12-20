package cn.happy.day02;

import java.util.Scanner;

/**
 * 定义一个长度为5的数组，代表的是五位学生的成绩。
 * 写一个方法统计出学生平均成绩
 * 写一个方法统计出成绩最大值。
 * @author Happy
 *
 */
public class Process {
   
	
	//3.扫描仪
	public int avgScore(int[] num){
		int sum=0;//存储总和
		for (int i = 0; i < num.length; i++) {
			sum=sum+num[i];
		}
		//循环end后，sum中存总和
		int avg=sum/num.length;
		return avg;
	}
	
	//求最大值
	public int getMaxFromArray(int[] num){
		//1.默认数组的第一项为最大值
		int max=num[0];
		for (int i = 0; i < num.length; i++) {
			if(num[i]>max){
				max=num[i];
			}
		}
		return max;
	}
	
}













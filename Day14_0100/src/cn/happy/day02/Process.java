package cn.happy.day02;

import java.util.Scanner;

/**
 * ����һ������Ϊ5�����飬���������λѧ���ĳɼ���
 * дһ������ͳ�Ƴ�ѧ��ƽ���ɼ�
 * дһ������ͳ�Ƴ��ɼ����ֵ��
 * @author Happy
 *
 */
public class Process {
   
	
	//3.ɨ����
	public int avgScore(int[] num){
		int sum=0;//�洢�ܺ�
		for (int i = 0; i < num.length; i++) {
			sum=sum+num[i];
		}
		//ѭ��end��sum�д��ܺ�
		int avg=sum/num.length;
		return avg;
	}
	
	//�����ֵ
	public int getMaxFromArray(int[] num){
		//1.Ĭ������ĵ�һ��Ϊ���ֵ
		int max=num[0];
		for (int i = 0; i < num.length; i++) {
			if(num[i]>max){
				max=num[i];
			}
		}
		return max;
	}
	
}













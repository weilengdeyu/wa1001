package cn.happy.day03;

import java.util.Arrays;
import java.util.Scanner;

public class T2 {
     //�����㷨
	public static void main(String[] args) {
		int[] nums={99,85,82,63,60};
		//����
		Arrays.sort(nums);
		//1.����һ������Ϊ6������
		int[] newNums=new int[nums.length+1];
		//2.��ֵ  ��������� i���ֵ  ��ֵ���������i��Ŀ
		for (int i = 0; i < nums.length; i++) {
			newNums[i]=nums[i];
		}
		int num=70;
		int index=newNums.length-1;//����Ŀ��λ��
		//3.��λ��
		for (int i = 0; i < newNums.length; i++) {
			if (newNums[i]>num) {
				//��ǰi��ֵ����numӦ��ռ�е�λ��
				index=i;
				break;
			}
		}
		
		System.out.println(index+"========================");
		//4.Ԫ�غ���  ������
		
		for (int i = newNums.length-1; i >index; i--) {
			newNums[i]=newNums[i-1];
		}
		
		
		//5.��index���¸�ֵ
		newNums[index]=num;
		
		
		//6.��ӡ����Ԫ��
		for (int i = 0; i < newNums.length; i++) {
			System.out.println(newNums[i]);
		}
		
		
		
	}

}
















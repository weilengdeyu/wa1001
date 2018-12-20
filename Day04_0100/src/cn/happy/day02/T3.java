package cn.happy.day02;

import java.util.Scanner;

public class T3 {

	public static void main(String[] args) {
	   int[] nums={12,33,44,55,66};
	   int insertNum=45;
	   //1.定义一个新数组
	   int[] newNums=new int[nums.length+1];
	   //2.赋值
	   for (int i = 0; i < nums.length; i++) {
		   newNums[i]=nums[i];
	   }
	   //3.找位置
	   int index=newNums.length-1;
	   for (int i = 0; i < newNums.length; i++) {
		  if(newNums[i]>insertNum){
			  index=i;
			  break;
		  }
	   }
	   
	   //4.元素后移，倒着移
	   for (int i = newNums.length-1; i >index ; i--) {
		    newNums[i]=newNums[i-1];
	   }
	   
	   //5.重新赋值
	   newNums[index]=insertNum;
	   for (int i = 0; i < newNums.length; i++) {
		  System.out.println(newNums[i]);
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	}
	

}

package cn.happy.day03;

public class T7 {
	public static void main(String[] args) {
	   int leftNum=10;
	   int rightNum=8;
	   System.out.println("交换前：左手的数字是"+leftNum+"\t右手的数字是"+rightNum);
	   
	   int temp=leftNum;
	   leftNum=rightNum;
	   rightNum=temp;
	   
	   System.out.println("交换后：左手的数字是"+leftNum+"\t右手的数字是"+rightNum);
	}
}

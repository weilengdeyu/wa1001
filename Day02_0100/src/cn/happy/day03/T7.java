package cn.happy.day03;

public class T7 {
	public static void main(String[] args) {
	   int leftNum=10;
	   int rightNum=8;
	   System.out.println("����ǰ�����ֵ�������"+leftNum+"\t���ֵ�������"+rightNum);
	   
	   int temp=leftNum;
	   leftNum=rightNum;
	   rightNum=temp;
	   
	   System.out.println("���������ֵ�������"+leftNum+"\t���ֵ�������"+rightNum);
	}
}

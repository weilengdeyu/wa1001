package cn.happy.day06;

public class T1 {

	public static void main(String[] args) {
		Student stu=new Student();
		//���ݷ������ȹ���ʹ��������ķ�����ֻ��ͨ��������.������()
		int num11=3;
		int num2=5;
	    stu.test(num11, num2);
	    //����һ��  ˳��   ����   ����
	    stu.test2(100,"��־ΰ");
	    int sum2=stu.test3(1, 2);
	    System.out.println(sum2);
	    int[] nums={1,2,3};
	    stu.test4(nums);
	    
	}
}

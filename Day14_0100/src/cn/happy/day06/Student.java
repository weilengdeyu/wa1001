package cn.happy.day06;
//
public class Student {
    //01.���㴫����������ͱ����ĺ�
	public void test(int num1,int num2){
		int sum=num1+num2;
		System.out.println(sum);
	}
	//02.���������ʱ��ע������һ��
	public void test2(int money,String nickName){
		System.out.println("����Ϊ"+nickName+"���ˣ�ӵ��"+money+"�ʲ�");
	}
	//03.���δ�����ֵ
	public int test3(int num1,int num2){
		int sum=num1+num2;
		return sum;
	}
	//������Ϊ����
	public void test4(int[] nums){
	   for (int i = nums.length-1; i>=0; i--) {
		  System.out.println(nums[i]);
	   }
	}
	
	
	
}












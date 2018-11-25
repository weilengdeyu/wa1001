package cn.happy.day06;
//
public class Student {
    //01.计算传入的两个整型变量的和
	public void test(int num1,int num2){
		int sum=num1+num2;
		System.out.println(sum);
	}
	//02.参数传入的时候，注意三个一致
	public void test2(int money,String nickName){
		System.out.println("名称为"+nickName+"的人，拥有"+money+"资产");
	}
	//03.带参带返回值
	public int test3(int num1,int num2){
		int sum=num1+num2;
		return sum;
	}
	//数组作为参数
	public void test4(int[] nums){
	   for (int i = nums.length-1; i>=0; i--) {
		  System.out.println(nums[i]);
	   }
	}
	
	
	
}












package cn.happy.day06;

public class T1 {

	public static void main(String[] args) {
		Student stu=new Student();
		//根据方法调度规则，使用其他类的方法，只能通过对象名.方法名()
		int num11=3;
		int num2=5;
	    stu.test(num11, num2);
	    //三个一致  顺序   类型   个数
	    stu.test2(100,"李志伟");
	    int sum2=stu.test3(1, 2);
	    System.out.println(sum2);
	    int[] nums={1,2,3};
	    stu.test4(nums);
	    
	}
}

package cn.happy;
import java.util.Scanner;

/**
 * 上机练习5：添加用户信息
 * 
 *
 */
public class AddUser {


	public static void main(String[] args) {
		System.out.println("青鸟迷你游戏平台 > 添加用户信息\n");
		int custNo = 0;	    //用户编号						
		int age;	//年龄
		int points = 0;		//积分	
		System.out.println("请输入要录入用户的数量：");
		Scanner input = new Scanner(System.in);
		int count=input.nextInt();
		//循环录入用户信息
		for(int i=0;i<count;i++){
			System.out.print("请输入用户编号（<4位整数>）：");
			custNo = input.nextInt();
			System.out.print("请输入用户年龄：");
			age = input.nextInt();
			if(age<10 || age>100){	//年龄不合适则跳出
				System.out.println("很抱歉，您的年龄不适宜玩游戏");
				System.out.println("录入信息失败\n");
				continue;
			}
			System.out.print("请输入会员积分：");
			points = input.nextInt();

			System.out.println("您录入的会员信息是：");
			System.out.println("用户编号："+custNo+ "\t年龄：" +age+ "\t积分：" +points+ "\n");
		}
	}
}

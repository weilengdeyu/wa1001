package cn.happy.day02;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

/**
 * 代表的是游戏
 * 综合调度玩家和电脑
 * 判定输赢的业务逻辑都在这个类中。他说了算
 * 包括对战结果的统计等等
 * @author Happy
 *
 */
public class Game {
	   Computer computer=new Computer();
	   Person  person=new Person();
	   int count;
   public void start(){
	
	   Scanner input=new Scanner(System.in);
	   //游戏开始的界面
	   System.out.println("===欢迎进入微冷的雨猜拳游戏====");
	   System.out.println("===出拳规则：1、剪刀  2、石头 3、布 ====");
	   System.out.println("===请选择对战角色(1、刘德华  2、张靓颖  3、李小龙) 输入对应的数字即可====");
	   if (input.hasNextInt()) {
		   //证明 输入的是数字，但不一定是1,2,3
		   int userInput = input.nextInt();
		   while (userInput!=1  &&  userInput!=2  && userInput!=3) {
			  System.out.println("大爷，该角色尚未启用，请重新输入");
			  userInput = input.nextInt();
		   }
		   //代码执行到这里，证明用户输入的是1,2,3中的一个
		  
		switch (userInput) {
			case 1:
				computer.computername="刘德华";
				break;
			case 2:
				computer.computername="张靓颖";
				break;
			case 3:
				computer.computername="李小龙";
				break;
		}
		System.out.println("请输入玩家的姓名");
		person.name=input.next();
		//打印对战双方的名称
		System.out.println(person.name+"VS"+computer.computername+"对战");
		System.out.println("确定对战吗？(y/n)");
		String isOrNot = input.next();
		int count=0; //保存对战次数
		while(isOrNot.equals("y")){
			count++;//循环一次  +1  代表对战了一次
			System.out.println("请出拳，1、剪刀  2、石头 3、布");
			int num = input.nextInt();
			switch (num) {
			case 1:
				System.out.println("您出拳:剪刀");
				break;
			case 2:
				System.out.println("您出拳:石头");
				break;
			case 3:
				System.out.println("您出拳:布");
				break;
			default:
				System.out.println("呵呵哒，你玩过游戏吗");
				break;
			}
			int computerChuQunResult = computer.showFist();
			//1 剪刀  2石头  3布
			//用户赢   1 3
			if( (num==1 && computerChuQunResult==3) ||(num==2 && computerChuQunResult==1) ||(num==3 && computerChuQunResult==2)  ){
				System.out.println("恭喜，本局胜利");
				person.score=person.score+1;
			}else if( (num==1 && computerChuQunResult==2) ||(num==2 && computerChuQunResult==3) ||(num==3 && computerChuQunResult==1)){
				System.out.println("不好意思，本局您彻底输了，你个SB");
				computer.computerscore=computer.computerscore+1;;
			}else{
				System.out.println("呵呵，竟然是平局，咱俩在伯仲之间");
			}
			System.out.println("是否开始下一局(y/n)");
			isOrNot=input.next();
		}
		//代码执行到这里，证明用户退出对战模式，开始进行最终的结果统计局
		System.out.println("--------------------------------------------");
		System.out.println(computer.computername+" VS "+person.name);
		System.out.println("对战次数"+count);
		System.out.println("姓名\t得分");
		System.out.println(person.name+"\t"+person.score);
		System.out.println(computer.computername+"\t"+computer.computerscore);
		if (person.score<computer.computerscore) {
			System.out.println("最终结果：输了，这次是我让着你，让你嘚瑟一会儿");
		}else if(person.score==computer.computerscore){
			System.out.println("最终结果：平局，今天我不在状态，要不然的话怎么能是平局");
		}else{
			System.out.println("最终结果：赢，呵呵，其实我只用了一层功力");
		}
	   }else{
		   System.out.println("大爷，请输入整数 啊");
	   }   
   }
}

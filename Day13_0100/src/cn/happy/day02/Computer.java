package cn.happy.day02;

import java.util.Scanner;

/**
 * 这是计算机类，就是程序中（游戏中）我们对战的对象
 * @author Happy
 *
 */
public class Computer {
   public String computername; //电脑的昵称
   public int computerscore;  //电脑的得分
   //写一个电脑出拳的方法
    int showFist(){
	   //在java领域，可以通过如下代码完成  系统自动抛出 1-3之间的随机数 ，暗示着电脑出拳的1,2,3
	   int show = (int)(Math.random()*10)%3 + 1;  //产生随机数，表示电脑出拳
	   switch (show) {
		case 1:
			System.out.println(computername+"出拳：剪刀");
			break;
		case 2:
			System.out.println(computername+"出拳：石头");
			break;
		case 3:
			System.out.println(computername+"出拳：布");
			break;
		default:
			System.out.println("电脑疯了");
			break;
		}
	   return show;
   }
}

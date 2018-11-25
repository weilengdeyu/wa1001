package cn.happy.day02;

import java.util.Scanner;

/**
 * 定义一个Person类   
 * 
 * 代表玩家  
 * @author Happy
 *
 */
public class Person {
   //我们都知道，玩家都有自己的名称（对战的时候用）和得分（统计对战结果的时候用） 
   public String name; //玩家的名称
   public int score;//玩家的得分
   
   public int showFist(){
		  Scanner input=new Scanner(System.in);
		  System.out.println("请出拳：：1、剪刀  2、石头 3、布 ，输入对应数字即可");
		  int userChuDeQuanTou = input.nextInt();
		  switch (userChuDeQuanTou) {
			  case 1: 
		    	  System.out.println("你出拳: 剪刀");
		    	  break;
		      case 2:
		    	  System.out.println("你出拳: 石头");
		    	  break;
		      case 3: 
		    	  System.out.println("你出拳: 布");
		    	  break;
		 }
		 return userChuDeQuanTou;
   }
}

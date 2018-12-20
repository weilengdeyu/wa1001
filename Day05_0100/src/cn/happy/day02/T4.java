package cn.happy.day02;

import java.util.Scanner;

public class T4 {

	public static void main(String[] args) {
		
		
		/*{
			int num=12;
		}
		{
			
			System.out.println(num);
		}
		*/
		
		
		Scanner input=new Scanner(System.in);
		String hasZugoudeMoney="";
		  /*让他先上机编写程序完成，
			然后老师检查是否合格。如果不合格，则继续编写。
		   * */
		  do{
			  System.out.println("努力写代码，将来娶媳妇，要娶别人的媳妇");
			  System.out.println("钱够了吗？输入y或者n即可");
			  hasZugoudeMoney=input.next();
		  }while(!hasZugoudeMoney.equals("y"));
		  
	}

}











package cn.happy;

import java.util.Scanner;

public class T3 {

	public static void main(String[] args) {
       /*
        * 老师每天检查张浩的学习任务是否合格。如果不合格，则继续进行。
		     老师给张浩安排的每天的学习任务为：上午阅读教材，学习理论部分，下午上机编程，掌握代码部分
        * */
		//01.初始变量
		String isOrNot="不合格";
		Scanner input=new Scanner(System.in);
		while(isOrNot.equals("不合格")){
			
			System.out.println("上午阅读教材，学习理论部分，下午上机编程，掌握代码部分");
			
			//04.改变迭代变量
			System.out.println("老师，合格了吗？");
			isOrNot=input.next();
			
		}
		System.out.println("恭喜，您终于合格了");
		
		
	}

}

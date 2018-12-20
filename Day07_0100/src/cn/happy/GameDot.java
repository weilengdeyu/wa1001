package cn.happy;

import java.util.Scanner;
/**
 * 上机练习4：统计游戏点击率
 *
 */
public class GameDot {
	public static void main(String[] args) {
		 int score; 					// 点击率
	        int total; 					// 游戏总数量
	        int num = 0; 					//点击率大于100的游戏数量
	        Scanner input = new Scanner(System.in);
	        System.out.println("青鸟迷你游戏平台 > 游戏点击率\n");

	        for (int i = 0; i < 4; i++) {
	            System.out.print("请输入第" + (i + 1) + "个游戏的点击率: ");
	            score = input.nextInt();
	            if (score <= 100) {
	                continue;
	            }
	            num++;
	        }        
	        System.out.println("点击率大于100的游戏数是: " + num);
	        double rate =  (double)num / 4 * 100;
	        System.out.println("点击率大于100的游戏所占的比例为:" + rate + "%");        
	}	
}

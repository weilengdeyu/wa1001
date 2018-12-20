package cn.happy;

import java.util.Scanner;

/**
 * 上机练习2：玩游戏并晋级
 */

public class GameGrade {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = 1;
		int count = 0; //计数
		int score = 0; //游戏成绩
		String answer;
		System.out.println("青鸟迷你游戏平台 > 游戏晋级\n");
		 do{
			System.out.print("您正在玩第" + n + "局,成绩为： ");
			score = input.nextInt();
			if (score > 80) {
				count++;
			}
			n++;
			if (n > 5) {
				System.out.print("游戏结束");
			} else {
				System.out.print("继续玩下一局吗？(yes/no) ");
				answer = input.next();
				if (answer.equals("no")) {
					System.out.print("您已经中途退出游戏。");
					break;
				} else {
					System.out.println("进入下一局");
				}
			}

		}while (n <= 5);

		double rate = count / 5.0; // 计算达到80分之上的比率
		if (n >5) {
			if (rate > 0.9) {
				System.out.println("\n恭喜！通过一级");
			} else if (rate > 0.6) {
				System.out.println("\n通过二级，继续努力！");
			} else {
				System.out.println("\n对不起，您未能晋级，继续加油啊！");
			}
		} else {
			System.out.println("\n对不起，您未能晋级，继续加油啊！");
		}
	}

}

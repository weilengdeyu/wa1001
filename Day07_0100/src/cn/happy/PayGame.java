package cn.happy;

import java.util.Scanner;

/**
 * 上机练习3：支付游戏币
 * 
 * 
 */
public class PayGame {
	public static void main(String[] args) {
		System.out.println("青鸟迷你游戏平台 > 游戏币支付\n");

		System.out.println("请选择您玩的游戏类型：");
		System.out.println("\t1.牌类");
		System.out.println("\t2.休闲竞技类");

		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		System.out.println("请您输入游戏时长：");
		int time = input.nextInt();
		int qm = 0;
		switch (choice) {
		case 1:
			if (time > 10) {
				System.out.println("您玩的是牌类游戏，时长是：" + time + "小时,可以享受5折优惠");
				qm = (int) (10 * time * 0.5);
				System.out.println("您需要支付" + qm + "个游戏币");
			} else {
				System.out.println("您玩的是牌类游戏，时长是：" + time + "小时,可以享受8折优惠");
				qm = (int) (10 * time * 0.8);
				System.out.println("您需要支付" + qm + "个游戏币");
			}
			break;
		case 2:
			if (time > 10) {
				System.out.println("您玩的是休闲竞技类游戏，时长是：" + time + "小时,可以享受5折优惠");
				qm = (int) (20 * time * 0.5);
				System.out.println("您需要支付" + qm + "个游戏币");
			} else {
				System.out.println("您玩的是休闲竞技类游戏，时长是：" + time + "小时,可以享受8折优惠");
				qm = (int) (20 * time * 0.8);
				System.out.println("您需要支付" + qm + "个游戏币");
			}
			break;
		default:
			System.out.print("无效选择");
		}

	}

}

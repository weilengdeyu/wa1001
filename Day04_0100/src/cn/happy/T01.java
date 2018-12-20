package cn.happy;

public class T01 {

	public static void main(String[] args) {
		//sw之后 alt+/，然后回车
		int mingci=4;
		switch (mingci) {
		case 1:
			System.out.println("奖励去麻省理工夏令营一个月");
			break;
		case 2:
			System.out.println("奖励hp笔记本一台");
			break;
		case 3:
			System.out.println("奖励移动硬盘一个");
			break;
		default:
			System.out.println("没有奖励");
			break;
		}
	}

}

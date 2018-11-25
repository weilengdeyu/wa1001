package cn.happy.day02;

public class T1 {

	public static void main(String[] args) {
		//01.Java 中  想让系统  抛出一个随机数   Java 提供了一个Math.random()
		//02.默认情况下，Java帮我们生成的随机数的范围 0到1之前的一个小数 （前闭后开区间  [0,1)）
		double random=Math.random();
		System.out.println(random);
		
		//03, i want let you generate a number between 0,9
		int myrandom=(int)(Math.random()*10);
		System.out.println(myrandom);
		
		
		

	}

}

package cn.happy;

public class T3 {

	public static void main(String[] args) {
	   //如果java成绩>98 并且音乐成绩>80   获得奖励
		
		//或者 java==100  并且  音乐成绩>70 获得奖励
		
		//1.定义一个变量，存储Java成绩
		int javaScore=100;
		
		
		
		//2,定义一个变量存储音乐成绩
		int musicScore=90;
		
		//3.断定是否获得奖励 
		if((javaScore>98 && musicScore>80 )||(javaScore==100  &&  musicScore>70)){
			//4.打印奖励内容
			System.out.println("去哈佛大学夏令营一周");
		}
		
		
		
		
		

	}

}

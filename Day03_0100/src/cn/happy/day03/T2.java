package cn.happy.day03;

public class T2 {

	public static void main(String[] args) {
		//学校举行运动会，百米赛跑跑入10秒内的学生有资格进决赛，
		//01.设置一个跑100米需要的时间 
		 double time = 1;
		 //02定义一个变量存储性别
		 String gender="女";
		 if(time<10){
			 //可以进入决赛
			//根据性别分别进入男子组和女子组
			 if(gender.equals("男")){
				 System.out.println("恭喜，进入男子组");
			 }else{
				 System.out.println("恭喜，进入女子组");
			 }
		 }else{
			 System.out.println("无情淘汰，下年努力，继续奋斗，不要放弃！！！！！！");
		 }
		


	}

}

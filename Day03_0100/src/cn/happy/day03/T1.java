package cn.happy.day03;

public class T1 {

	public static void main(String[] args) {
		// 多重if提升版
        //01.设置一个我自己的存款
		//02.多重if 他的N个else if分支 顺序 对执行结果有影响     else是可有可无的。
		int money=300;
		if(money>=500){
			System.out.println("凯迪拉克一台");
		}else if(money>=50){
			System.out.println("伊兰特");
		}else if(money>=100){
			System.out.println("帕萨特");
		}else if(money>=10){
			System.out.println("奥拓");
		}else if(money<10){
			System.out.println("捷安特");
		}

	}

}

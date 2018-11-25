package cn.happy.day01;
/**
 * 类
 * @author Happy
 *
 */
public class Student {
    //属性
	String name; //null
	int age; //0
	String phone;
	String email;
	String address;
	//方法
	//学习的方法
	public void study(){
		System.out.println(name+"正在努力学习");
	}
	
	//写作业的方法
	public void doHomeWork(){
		System.out.println(name+"正在专心的写作业");
	}
	
	//写周记的方法
	public void writeWeekNote(){
		System.out.println(name+"正在认真的写周记");
	}
	
	
	//玩耍的方法
	public  void playGame(){
		System.out.println(name+"正在疯狂的玩游戏");
	}
}

package cn.happy.day01;

public class T1 {

	public static void main(String[] args) {
	
		
		Product pro=new Product();
		pro.proName="三只松鼠";
		pro.proPrice=30;
		pro.printInfo();
		
		
		Student stu=new Student();
		stu.name="张靓颖";
		stu.age=20;
		System.out.println("姓名是"+stu.name);
		stu.study();
		
		
		
		Student stu2=new Student();
		stu2.name="Happy";
		stu2.age=18;
		System.out.println("姓名是"+stu2.name);
		stu2.doHomeWork();
		
		Student stu3=new Student();
		stu3.name="黄黄黄";
		stu3.age=38;
		System.out.println("姓名是"+stu3.name);
		
		stu3.playGame();
	}

}

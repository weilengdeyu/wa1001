package cn.happy.day01;

public class T1 {

	public static void main(String[] args) {
	
		
		Product pro=new Product();
		pro.proName="��ֻ����";
		pro.proPrice=30;
		pro.printInfo();
		
		
		Student stu=new Student();
		stu.name="����ӱ";
		stu.age=20;
		System.out.println("������"+stu.name);
		stu.study();
		
		
		
		Student stu2=new Student();
		stu2.name="Happy";
		stu2.age=18;
		System.out.println("������"+stu2.name);
		stu2.doHomeWork();
		
		Student stu3=new Student();
		stu3.name="�ƻƻ�";
		stu3.age=38;
		System.out.println("������"+stu3.name);
		
		stu3.playGame();
	}

}

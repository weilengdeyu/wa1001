package cn.happy.day02;

public class T1 {

	public static void main(String[] args) {
		StudentManager manger=new StudentManager();
		manger.addStudent("张二狗");
		manger.addStudent("李铁蛋");
		System.out.println("修改前=====================");
		manger.printStuInfo();
		manger.updateStudent("李铁蛋", "李小龙");
		System.out.println("修改后==========================\n");
		manger.printStuInfo();
		
		/*manger.printStuInfo();
		boolean result = manger.search(1, 3, "曹颖");
		if (result==true) {
			System.out.println("呵呵哒，找到了");
		}else {
			System.out.println("没找到");
		}*/
	}

}

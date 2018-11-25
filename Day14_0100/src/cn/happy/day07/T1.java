package cn.happy.day07;

public class T1 {

	public static void main(String[] args) {
		StudentManager manager=new StudentManager();
		Student stu=new Student();
		stu.age=10;
		stu.name="好人";
		System.out.println("修改前======================");
		System.out.println(stu.name);
		System.out.println(stu.age);
		
		//该方法主要更改传入对象的属性
		manager.changeStudentInfoByInParameter(stu);
		
		System.out.println("修改后======================");
		System.out.println(stu.name);
		System.out.println(stu.age);
	}

}

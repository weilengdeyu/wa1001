package cn.happy.day07;

public class T1 {

	public static void main(String[] args) {
		StudentManager manager=new StudentManager();
		Student stu=new Student();
		stu.age=10;
		stu.name="����";
		System.out.println("�޸�ǰ======================");
		System.out.println(stu.name);
		System.out.println(stu.age);
		
		//�÷�����Ҫ���Ĵ�����������
		manager.changeStudentInfoByInParameter(stu);
		
		System.out.println("�޸ĺ�======================");
		System.out.println(stu.name);
		System.out.println(stu.age);
	}

}

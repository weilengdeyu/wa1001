package cn.happy.day02;

public class T1 {

	public static void main(String[] args) {
		StudentManager manger=new StudentManager();
		manger.addStudent("�Ŷ���");
		manger.addStudent("������");
		System.out.println("�޸�ǰ=====================");
		manger.printStuInfo();
		manger.updateStudent("������", "��С��");
		System.out.println("�޸ĺ�==========================\n");
		manger.printStuInfo();
		
		/*manger.printStuInfo();
		boolean result = manger.search(1, 3, "��ӱ");
		if (result==true) {
			System.out.println("�Ǻ��գ��ҵ���");
		}else {
			System.out.println("û�ҵ�");
		}*/
	}

}

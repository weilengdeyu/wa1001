package cn.happy.day01;
/**
 * ��
 * @author Happy
 *
 */
public class Student {
    //����
	String name; //null
	int age; //0
	String phone;
	String email;
	String address;
	//����
	//ѧϰ�ķ���
	public void study(){
		System.out.println(name+"����Ŭ��ѧϰ");
	}
	
	//д��ҵ�ķ���
	public void doHomeWork(){
		System.out.println(name+"����ר�ĵ�д��ҵ");
	}
	
	//д�ܼǵķ���
	public void writeWeekNote(){
		System.out.println(name+"���������д�ܼ�");
	}
	
	
	//��ˣ�ķ���
	public  void playGame(){
		System.out.println(name+"���ڷ�������Ϸ");
	}
}

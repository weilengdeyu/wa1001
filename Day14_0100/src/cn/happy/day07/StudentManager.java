package cn.happy.day07;
import java.util.Scanner;



/**
 * ѧ��������
 * @author Happy
 *
 */
public class StudentManager {
    //01.�������ѧ������ ��name ��ƴ��"΢������Ʒ��������Ʒ"  �������age����ֵ���ԭ��������
	public void changeStudentInfoByInParameter(Student stu){
		
		stu.name=stu.name+"΢������Ʒ��������Ʒ";
	    stu.age=stu.age*2;
	}
}


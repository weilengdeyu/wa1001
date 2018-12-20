package cn.happy.day07;
import java.util.Scanner;



/**
 * 学生管理类
 * @author Happy
 *
 */
public class StudentManager {
    //01.将传入的学生对象 的name 后拼接"微冷的雨出品，必属精品"  ，对象的age属性值变成原来的两倍
	public void changeStudentInfoByInParameter(Student stu){
		
		stu.name=stu.name+"微冷的雨出品，必属精品";
	    stu.age=stu.age*2;
	}
}


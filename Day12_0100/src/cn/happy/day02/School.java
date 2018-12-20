package cn.happy.day02;
/**
 * 定义了一个School
 * @author Happy
 *
 */
public class School {
   public  String centerName;
   public  int classRoomNumber;
   public  int libraryRoomNumber;
   
   //展示信息的方法
   public void showInfo(){
	   System.out.println(centerName+"有"+classRoomNumber+"教室，并且有"+libraryRoomNumber+"个机房");
   }
}

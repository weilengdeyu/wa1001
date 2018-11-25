package cn.happy.day02;

public class Customer {
	
   public String name;
   public int age;
   
   public void showInfo(){
	   if(age>=18&&age<=60){
		   System.out.println("您的姓名是"+name+"您需要支付的门票价格为20");
	   }else{
		   System.out.println("您的姓名是"+name+"您可以免费游览");
	   }
   }
}

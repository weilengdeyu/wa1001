package cn.happy.day02;

public class Customer {
	
   public String name;
   public int age;
   
   public void showInfo(){
	   if(age>=18&&age<=60){
		   System.out.println("����������"+name+"����Ҫ֧������Ʊ�۸�Ϊ20");
	   }else{
		   System.out.println("����������"+name+"�������������");
	   }
   }
}

package cn.happy.day03;

public class T8 {

	public static void main(String[] args) {
       String  str="�㰮���Ұ���������"; //��
       String  findStr="��";
       String[] names=new String[str.length()];
       for (int i = 0; i < names.length; i++) {
		  names[i]=str.substring(i, i+1);
	   }
       
       for (int i = 0; i < names.length; i++) {
    	   System.out.println(names[i]);
           
	   }
      
 
       
       
       
       System.out.println();
       
		
         
	}

}

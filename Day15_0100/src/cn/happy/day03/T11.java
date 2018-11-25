package cn.happy.day03;

public class T11 {

	public static void main(String[] args) {
	   String str="123456";
       StringBuffer sb=new StringBuffer(str);  
       int i = sb.length()-3;//3
       for (; i >0; i=i-3) {
    	   sb.insert(i, ",");
	   }
       System.out.println(sb.toString());
     
	}

}

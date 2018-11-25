package cn.happy.day03;

public class T10 {

	public static void main(String[] args) {
       StringBuffer sb=new StringBuffer();
       sb.append("李老师来了"); 
       sb.insert(3, "终于");
       sb.insert(7, "李老师终于走了");
       System.out.println(sb.toString());
         
	}

}

package cn.happy.day04;

public class T1 {

	public static void main(String[] args) {
	    test();
	}

	private static void test() {
		String s1=new String("abc");
		String s2="ef";
		s2=s1.toUpperCase().concat(s2);
		s2.substring(2,4);
        System.out.println(s2);
		
	}

}

package cn.happy.day03;

public class T1 {

	public static void main(String[] args) {
		//有三个科目的成绩，拼接打印
	/*    int sql=80;
	    int java=90;
	    double html=86.7;
	    System.out.println("sql的成绩是"+sql+"java的成绩是"+java+"html的成绩是"+html);*/
		
		String word1="2018年还有40天";
		String word2="，离春节还有76天";
		/*String word3=word1+word2;*/
	    word1=word1.concat(word2);
		System.out.println(word1);
	}

}

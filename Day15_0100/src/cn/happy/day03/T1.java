package cn.happy.day03;

public class T1 {

	public static void main(String[] args) {
		//��������Ŀ�ĳɼ���ƴ�Ӵ�ӡ
	/*    int sql=80;
	    int java=90;
	    double html=86.7;
	    System.out.println("sql�ĳɼ���"+sql+"java�ĳɼ���"+java+"html�ĳɼ���"+html);*/
		
		String word1="2018�껹��40��";
		String word2="���봺�ڻ���76��";
		/*String word3=word1+word2;*/
	    word1=word1.concat(word2);
		System.out.println(word1);
	}

}

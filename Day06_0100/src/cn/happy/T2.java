package cn.happy;

import java.util.Scanner;

public class T2 {

	public static void main(String[] args) {
		// ѭ������ĳͬѧS1��ҵ���Ե�5�ſγɼ���������ƽ����
		Scanner input=new Scanner(System.in);
		System.out.println("������������ͬѧ��3�ſγ̵ĳɼ�");
		
		int firstCourseScore = input.nextInt();
	    int secondCourseScore=input.nextInt();
	    int thirdCourseScore=input.nextInt();
	    
	    //�ܳɼ�
	    int totalScore=firstCourseScore+secondCourseScore+thirdCourseScore;
	    
	    //ƽ����
	    int avgScore=totalScore/3;
	    
	    System.out.println("ƽ������"+avgScore);
	    

	}

}

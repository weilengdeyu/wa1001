package cn.happy;

import java.util.Scanner;

public class T6 {

	public static void main(String[] args) {
	    
	  Scanner input=new Scanner(System.in);
	  int[] scores=new int[3];
      //�����û��Ӽ�����¼���3���ɼ�����ƽ����
	  //ѭ����ҵ���� �����Ͻ��յ��ĳɼ�  �����η���  ���� ��Ӧ��λ��
	  for (int i = 1; i <=3; i++) {
		 System.out.println("�������"+i+"λѧԱ�ĳɼ�");
		 scores[i-1]=input.nextInt();
	  }
	  int sum=0;
	  for (int i = 0; i < scores.length; i++) {
		 sum=sum+scores[i];
	  }
	  int avg=sum/scores.length;
	  System.out.println("ƽ����Ϊ"+avg);
	  
	}

}

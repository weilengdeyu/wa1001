package cn.happy;
import java.util.Scanner;

/**
 * �ϻ���ϰ5������û���Ϣ
 * 
 *
 */
public class AddUser {


	public static void main(String[] args) {
		System.out.println("����������Ϸƽ̨ > ����û���Ϣ\n");
		int custNo = 0;	    //�û����						
		int age;	//����
		int points = 0;		//����	
		System.out.println("������Ҫ¼���û���������");
		Scanner input = new Scanner(System.in);
		int count=input.nextInt();
		//ѭ��¼���û���Ϣ
		for(int i=0;i<count;i++){
			System.out.print("�������û���ţ�<4λ����>����");
			custNo = input.nextInt();
			System.out.print("�������û����䣺");
			age = input.nextInt();
			if(age<10 || age>100){	//���䲻����������
				System.out.println("�ܱ�Ǹ���������䲻��������Ϸ");
				System.out.println("¼����Ϣʧ��\n");
				continue;
			}
			System.out.print("�������Ա���֣�");
			points = input.nextInt();

			System.out.println("��¼��Ļ�Ա��Ϣ�ǣ�");
			System.out.println("�û���ţ�"+custNo+ "\t���䣺" +age+ "\t���֣�" +points+ "\n");
		}
	}
}

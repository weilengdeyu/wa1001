package cn.happy.day02;

public class T1 {

	public static void main(String[] args) {
		/*while(true){
			System.out.println("�򶹶�");
		}*/

		//����100���ڵ�ż��֮��
		int sum=0;//�ܺ�����
		int start=2; //01.��ʼ�������ó�2
		while(start<=100){
			/*sum=sum+start;*/
			sum+=start;
			start+=2;
		}
		System.out.println("�ܺ���"+sum);
		
	}

}

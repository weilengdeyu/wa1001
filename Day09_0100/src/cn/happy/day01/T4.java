package cn.happy.day01;

public class T4 {

	public static void main(String[] args) {
		/**
		 * 1.ֱ��������
			*
			**
			***
			****
			*****
			*��(j)          �к�(i)   j=i
			1                 1
			2                 2
			3                 3
			4                 4
			5                 5
		 */
		//1.���ѭ����������  
		for (int i = 1; i <=5; i++) {
			//2.�ڲ�ѭ������  *�Ÿ���  
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}


	}

}

package cn.happy.day01;

public class T5 {
	/** ����˼·���ҳ�������i���ڲ����j�Ĺ�ϵ
	 * 
	 *  	*
			***
			*****
			*******
			*********

      i(�к�)             j(*�Ÿ���)
         1                     1
		 2                     3
		 3                     5
		 4                     7
		 5                     9
		 j=2*i-1
	
		 
		 
	 */
	public static void main(String[] args) {
		
		for (int i = 1; i <=5; i++) {
			//2.�ڲ�ѭ������  *�Ÿ���  
			for (int j = 1; j <=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}



	}

}

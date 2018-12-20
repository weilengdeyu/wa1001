package cn.happy.day01;

public class T5 {
	/** 核心思路：找出外层变量i和内层变量j的关系
	 * 
	 *  	*
			***
			*****
			*******
			*********

      i(行号)             j(*号个数)
         1                     1
		 2                     3
		 3                     5
		 4                     7
		 5                     9
		 j=2*i-1
	
		 
		 
	 */
	public static void main(String[] args) {
		
		for (int i = 1; i <=5; i++) {
			//2.内层循环控制  *号个数  
			for (int j = 1; j <=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}



	}

}

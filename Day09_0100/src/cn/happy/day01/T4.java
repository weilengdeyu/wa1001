package cn.happy.day01;

public class T4 {

	public static void main(String[] args) {
		/**
		 * 1.直角三角形
			*
			**
			***
			****
			*****
			*号(j)          行号(i)   j=i
			1                 1
			2                 2
			3                 3
			4                 4
			5                 5
		 */
		//1.外层循环控制行数  
		for (int i = 1; i <=5; i++) {
			//2.内层循环控制  *号个数  
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}


	}

}

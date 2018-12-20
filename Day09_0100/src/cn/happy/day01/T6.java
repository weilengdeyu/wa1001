package cn.happy.day01;

public class T6 {
	/**
	    *****
		****
		***
		**
		*
		i(行号)             j(*号个数)
		1                     5
		2                     4
		3                     3
		4                     2
		5                     1
		i+j=6
		j=6-i;
		
		
		
		
		
		*/
	public static void main(String[] args) {
		for (int i = 1; i <=5; i++) {
			//2.内层循环控制  *号个数  
			for (int j = 1; j <=6-i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}

		


	}

}

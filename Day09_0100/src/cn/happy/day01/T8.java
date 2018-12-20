package cn.happy.day01;

public class T8 {
	/*                
	 *       *
	 *      ***
	 *     *****
	 *    *******
	 *    
	 *    i(行号)    j（空格）      k（*号）
	 *      1         3         1
	 *      2         2         3
	 *      3         1         5
	 *      4         0         7
	 *      
	 *      j<=4-i
	 *      k=2*i-1
	 *      

   	 *        
	 * 
	 * */
	public static void main(String[] args) {
		
		for (int i = 1; i <=4; i++) {
			//2.内层循环控制  空格个数  
			for (int j = 1; j<=4-i; j++) {
				System.out.print(" ");
			}
			//3.控制*号的
			for (int k = 1; k<=2*i-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		
		for (int i =3; i >=1; i--) {
			//2.内层循环控制  空格个数  
			for (int j = 1; j<=4-i; j++) {
				System.out.print(" ");
			}
			//3.控制*号的
			for (int k = 1; k<=2*i-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

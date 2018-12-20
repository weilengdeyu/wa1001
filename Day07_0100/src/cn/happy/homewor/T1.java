package cn.happy.homewor;

public class T1 {

	public static void main(String[] args) {
		// 求一个数字的阶乘         4!=1x2x3x4=24
		int sum=1;
		
		int num=4;
		String str=num+"!=";
		for (int i =1; i <=4; i++) {
			if (i<4) {
				str=str+i+"x";
			}else{
				str=str+i;
			}
			sum=sum*i;
		}
		
		System.out.println(str+"="+sum);
	}

}

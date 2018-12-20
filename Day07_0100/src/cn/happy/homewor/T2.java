package cn.happy.homewor;

public class T2 {

	public static void main(String[] args) {
		// 1到100之间的数字，判定它是不是7的倍数，如果不是，打印到屏幕上
		//开一个变量保存打印的是第 几个数？
		int count=0;
		int sum=0;
		for (int i = 1; i <=100; i++) {
			if (i%7!=0) {
				sum+=i;
				count++;
				System.out.print(i+"\t");
				if (count%4==0) {
					System.out.println();
				}
				
			}
		}
		System.out.println();
		System.out.println(sum);
	}

}

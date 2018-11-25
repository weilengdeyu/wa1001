package cn.happy.day02;

public class T1 {

	public static void main(String[] args) {
		/*while(true){
			System.out.println("打豆豆");
		}*/

		//计算100以内的偶数之和
		int sum=0;//总和容器
		int start=2; //01.初始变量设置成2
		while(start<=100){
			/*sum=sum+start;*/
			sum+=start;
			start+=2;
		}
		System.out.println("总和是"+sum);
		
	}

}

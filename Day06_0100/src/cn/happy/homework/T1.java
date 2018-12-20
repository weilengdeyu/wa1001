package cn.happy.homework;

public class T1 {

	public static void main(String[] args) {
		//for中可以嵌入if
		for (int i = 1; i <=100; i++) {
			//是3的倍数    
			//注意if选择结构的顺序
			
			if (i%3==0 && i%5==0) {
				System.out.println("flipflop");
			}else if(i%5==0){
				System.out.println("flop");
			}else if(i%3==0){
				System.out.println("flip");
			}else{
				System.out.println(i);
			}
		}

	}

}

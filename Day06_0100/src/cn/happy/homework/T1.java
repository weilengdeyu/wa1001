package cn.happy.homework;

public class T1 {

	public static void main(String[] args) {
		//for�п���Ƕ��if
		for (int i = 1; i <=100; i++) {
			//��3�ı���    
			//ע��ifѡ��ṹ��˳��
			
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

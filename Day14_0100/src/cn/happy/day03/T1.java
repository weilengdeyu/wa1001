package cn.happy.day03;

public class T1 {

	public static void main(String[] args) {
	int num=0,sum=0;
	while(num<=100){
		if(num%2==0){
			sum=sum+num;
		}
		num++;
	}
	System.out.println(sum);
	}

}

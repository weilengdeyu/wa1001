package cn.happy.day01;

public class T1 {
   
	public static void main(String[] args) {
		//������������ ��i��jû�г�ֵ   ��x��ֵΪ0
		int  i,j,x=0;
		//����ѭ��   ��ѭ�� 2��     
		for (i=0;i<2;i++){
			//����ѭ�� x��ֵ+1 ===================���ң�����+1��==================
		     x++;
		     //����ѭ����Ŀ����jΪ������ʱ�� x+1   ����֪�� 0 1 2 3ֻ�� 1 �� 3 Ϊ����  ����������ѭ��
		     //��������x��ֵ+2 ==================���ң�����+2��==================
		     for(j=0;j<=3;j++ ){
		           if(j%2 == 0) continue;
		               x++;
		     }
		     
		     //x��ֵ+1       =================���ң�����+1��===================
		    x++;
		} 
		
		System.out.println(x);
		


	}

}
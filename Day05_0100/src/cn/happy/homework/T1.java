package cn.happy.homework;

import java.util.Scanner;

public class T1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		//write a little  debug a little дһ�㣬����һ���
		System.out.println("MyShopping����ϵͳ > �������");
		System.out.println("*******************************");
		System.out.println("��ѡ������Ʒ�ı�ţ�");
		System.out.println("1.T��\t2.����Ь\t3.������");
		System.out.println("*******************************");
		String choice="y";//ָ������˼�Ǽ������� n ����������
		//�ۿ�
		double zhekou =0.8;
		//�ܽ��
		double totalMoney=0.0;
		
	    while(choice.equals("y")){
	    	System.out.println("�ף���������Ʒ���");
			
			String productName="";
			double productPrice=0.0;
			if(input.hasNextInt()==true){//��֤�û������������ 
				int num = input.nextInt(); //�����û��������Ʒ���
				//�û������������
				if(num==1||num==2||num==3){ //������ֻ��3����Ʒ
					//��������������
					switch (num) {  //ʹ��switch�϶��û���Ҫ�������Ʒ�����Ҹ��۸�����Ƹ�ֵ��
					case 1:
						productName="T��";
						productPrice=245;
						break;
					case 2:
						productName="����Ь";
						productPrice=570;
						break;
					case 3:
						productName="������";
						productPrice=320;
						break;
					default:
						break;
					}
					System.out.println("�ף���������Ʒ����");
					int shuliang=input.nextInt(); //�����û����������
					//��ӡ��Ʒ�����ƺͼ۸�
					double singleMoney=productPrice*shuliang;
					totalMoney=totalMoney+singleMoney;
					System.out.println(productName+"\t"+productPrice+"\t����"+shuliang+"\t�ϼ�"+(singleMoney));
					
					System.out.println("�Ƿ������(y/n)?");
				    choice=input.next();
				}else{
					//û�������Ʒ
					System.out.println("�ף�����Ʒ��δ�ϼܣ������ĵȴ�");
				}
			}
			else{
				//�û�������Ƿ�����
				System.out.println("�ף�����������");
			}
	    }
	    
	    //ѭ��ENding----------------------------------------------
	   double yingfuMoney=totalMoney*zhekou;
		System.out.println("Ӧ����"+yingfuMoney);
	}

}

package cn.happy.day03;

public class T1 {

	public static void main(String[] args) {
		// ����if������
        //01.����һ�����Լ��Ĵ��
		//02.����if ����N��else if��֧ ˳�� ��ִ�н����Ӱ��     else�ǿ��п��޵ġ�
		int money=300;
		if(money>=500){
			System.out.println("��������һ̨");
		}else if(money>=50){
			System.out.println("������");
		}else if(money>=100){
			System.out.println("������");
		}else if(money>=10){
			System.out.println("����");
		}else if(money<10){
			System.out.println("�ݰ���");
		}

	}

}

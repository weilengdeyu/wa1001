package cn.happy.day03;

public class T2 {

	public static void main(String[] args) {
         //�ַ�����ȡ����
         String str="����������,����Ҫд�ܼ�,���ڵ�һ�������ѧϰ�ܽ�";
         //indexOf(String str):index(λ��)
         //����1���������Ҫ���ҵ�С�ַ� ��
         //����ֵ��С�ַ������������ַ��е�һ�γ��ֵ�λ�ã�λ�ô�0��ʼ��
     
         //indexOf(String str,int index)
         //����һ���������Ҫ���ҵ�С�ַ� ��
         //�����������ҵ���ʼλ��
         //����ֵ��С�ַ������������ַ��е�һ�γ��ֵ�λ�ã�λ�ôӵڶ�������ָ����ֵ��ʼ����
         //СTip�����û���ҵ�С�ַ�����-1������ڶ����������������ַ������ȣ���Ȼ����-1
         
         
         
        /* int index = str.indexOf("��",100);*/
         int index = str.lastIndexOf("��");
         
         System.out.println(index);
	}

}

package cn.happy.day03;
/**
 * ����һ��������
 * @author Happy
 *
 */
public class Test {
   //����
	public String name;
	public int age;
	
	//����
	public void test1(){
		System.out.println("�����޲��޷���ֵ�ķ���");
	}
	
	//������ֵ�ķ���
	public String test2(){
		System.out.println("�����޲δ�����ֵ�ķ���");
		return "����";
	}
	/*���û������������֣������������ֵĺ�*/
	public void test3(int num1,int num2){
		int sum=num1+num2;
		System.out.println(sum);
	}
	
	//�����ַ�����   ʵ���ַ��������� abc  bcd
	public void test4(String str1,String str2){
		String str=str1+str2;
		System.out.println(str);
	}
	
	
	
}



























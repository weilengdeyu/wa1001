package cn.happy.day03;
/**
 * 定义一个测试类
 * @author Happy
 *
 */
public class Test {
   //属性
	public String name;
	public int age;
	
	//方法
	public void test1(){
		System.out.println("我是无参无返回值的方法");
	}
	
	//带返回值的方法
	public String test2(){
		System.out.println("我是无参带返回值的方法");
		return "张三";
	}
	/*让用户传入两个数字，计算两个数字的和*/
	public void test3(int num1,int num2){
		int sum=num1+num2;
		System.out.println(sum);
	}
	
	//关于字符串的   实现字符串的连接 abc  bcd
	public void test4(String str1,String str2){
		String str=str1+str2;
		System.out.println(str);
	}
	
	
	
}



























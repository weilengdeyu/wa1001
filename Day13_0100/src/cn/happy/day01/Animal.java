package cn.happy.day01;
//注释：单行
/*
 * 多行
 * 多行2
 * 多行3
 * */
/**
 * 文档注释
 * @author Happy
 *
 */
public class Animal {
	//一个类中可以有几个属性 ？   0到N个
		//两种东西
		//1.属性    数据类型    变量名称
		public int age;
		public String name;
		//2.方法
		//5个要素：1.访问修饰符
	     /*       2. 返回值类型
	      *       3.方法名称()
	      *       4.参数列表
	      *       5.方法体
	      * */
		public void run(){
			System.out.println("名称为"+name+"正在跑");
			//方法体
		}
		
		public int eat(){
			return 1;
		}
		
		
	    
}











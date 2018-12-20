package cn.happy.day03;

public class T2 {

	public static void main(String[] args) {
         //字符串提取方法
         String str="明天是周四,我们要写周记,关于第一本书你的学习总结";
         //indexOf(String str):index(位置)
         //参数1：代表的是要查找的小字符 串
         //返回值：小字符串在整个大字符中第一次出现的位置，位置从0开始数
     
         //indexOf(String str,int index)
         //参数一：代表的是要查找的小字符 串
         //参数二：查找的起始位置
         //返回值：小字符串在整个大字符中第一次出现的位置，位置从第二个参数指定的值开始搜索
         //小Tip：如果没有找到小字符返回-1，如果第二个参数大于整个字符串长度，仍然返回-1
         
         
         
        /* int index = str.indexOf("周",100);*/
         int index = str.lastIndexOf("周");
         
         System.out.println(index);
	}

}

package cn.happy.homework;

import java.util.Scanner;

public class T1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		//write a little  debug a little 写一点，测试一点点
		System.out.println("MyShopping管理系统 > 购物结算");
		System.out.println("*******************************");
		System.out.println("请选择购买商品的编号：");
		System.out.println("1.T恤\t2.网球鞋\t3.网球拍");
		System.out.println("*******************************");
		String choice="y";//指代的意思是继续购物 n ：结束购物
		//折扣
		double zhekou =0.8;
		//总金额
		double totalMoney=0.0;
		
	    while(choice.equals("y")){
	    	System.out.println("亲，请输入商品编号");
			
			String productName="";
			double productPrice=0.0;
			if(input.hasNextInt()==true){//保证用户输入的是数字 
				int num = input.nextInt(); //接收用户输入的商品编号
				//用户输入的是数字
				if(num==1||num==2||num==3){ //店面中只有3种商品
					//符合条件的输入
					switch (num) {  //使用switch断定用户需要购买的商品，并且给价格和名称赋值。
					case 1:
						productName="T恤";
						productPrice=245;
						break;
					case 2:
						productName="网球鞋";
						productPrice=570;
						break;
					case 3:
						productName="网球拍";
						productPrice=320;
						break;
					default:
						break;
					}
					System.out.println("亲，请输入商品数量");
					int shuliang=input.nextInt(); //接收用户输入的数量
					//打印商品的名称和价格
					double singleMoney=productPrice*shuliang;
					totalMoney=totalMoney+singleMoney;
					System.out.println(productName+"\t"+productPrice+"\t数量"+shuliang+"\t合计"+(singleMoney));
					
					System.out.println("是否继续：(y/n)?");
				    choice=input.next();
				}else{
					//没有这个商品
					System.out.println("亲，该商品尚未上架，请耐心等待");
				}
			}
			else{
				//用户输入的是非数字
				System.out.println("亲，请输入数字");
			}
	    }
	    
	    //循环ENding----------------------------------------------
	   double yingfuMoney=totalMoney*zhekou;
		System.out.println("应付金额："+yingfuMoney);
	}

}

package cn.happy.day02;

import java.util.Scanner;

public class T5 {

	public static void main(String[] args) {
		
      System.out.println("ÉãÊÏÎÂ¶È\t\t»ªÊÏÎÂ¶È");
      int sheshitemprature=0;
      double huashitemprature=0.0;
      int tiaomu=1;
	  do{
		  huashitemprature=sheshitemprature*9/5.0+32;
		 System.out.println(sheshitemprature+"\t\t"+huashitemprature);
		 tiaomu++;
		 sheshitemprature+=20;
	  }while(sheshitemprature<=250&&tiaomu<=10);
	}

}











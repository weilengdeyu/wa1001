package cn.happy.day01;

import java.util.Scanner;

public class Lucky01 {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	String answer="y";
    	do{
    		System.out.println("*****��ӭ���뽱�͸���ϵͳ*****");
    		System.out.println("\t1.ע��");
    		System.out.println("\t2.��¼");
    		System.out.println("\t3.�齱");
    		System.out.println("***************************");
    		System.out.print("��ѡ��˵���");
    		int choice = input.nextInt();
    		switch (choice) {
    		case 1:
    			System.out.println("[���͸���ϵͳ > ע��]");
    			break;
    		case 2:
    			System.out.println("[���͸���ϵͳ > ��¼]");
    			break;
    		case 3:
    			System.out.println("[���͸���ϵͳ > �齱]");
    			break;
    		default:
    			System.out.println("[������������]");
    			break;
    		}
    		System.out.print("�����𣿣�y/n��:");
    		answer = input.next();
    		System.out.println("");
    	}while("y".equals(answer));
		
	}
}

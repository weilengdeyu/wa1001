package cn.happy.day03;

public class T6 {

	public static void main(String[] args) {
        //�ж������ʽ�Ƿ���ȷ   yymqqc@126.com  916599408@qq.com
		String email="yymqqc@126.com";
		int index=email.indexOf("@");
		int index2=email.lastIndexOf(".");
		if (index!=-1&&index2!=-1) {
			System.out.println("����Ϸ�");
		}else{
			System.out.println("����Ƿ�");
		}
		
         
	}

}

package cn.happy.day03;

public class T5 {

	public static void main(String[] args) {
		String file="xxx����˲Ź��ض԰ɱ�˵��.mp3";
		int index=file.lastIndexOf(".");
		String extension = file.substring(index);
		System.out.println(extension);
		if (extension.equals(".java")) {
			System.out.println("����java�ļ�");
		}else{
			System.out.println("������java�ļ�");
		} 
		
		
		//�����ж����ļ��Ƿ���һ��.java�ļ�
		/*String file="�������˵��.mp3";
		int index=file.lastIndexOf(".java");
		if (index>=0) {
			System.out.println("��һ��java�ļ�");
		}else{
			System.out.println("����java�ļ�");
		}*/

		/*//�����ж����ļ��Ƿ���һ��java�ļ�
        String file="�������˵��.mp3";
        int index=file.lastIndexOf(".");
        String extension = file.substring(index);
        System.out.println(extension);
        if (extension.equals(".java")) {
			System.out.println("����java�ļ�");
		}else{
			System.out.println("������java�ļ�");
		} */
		
		
	}



	

}

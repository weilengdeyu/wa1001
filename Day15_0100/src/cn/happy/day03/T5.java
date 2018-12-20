package cn.happy.day03;

public class T5 {

	public static void main(String[] args) {
		String file="xxx大好人才怪呢对吧别说话.mp3";
		int index=file.lastIndexOf(".");
		String extension = file.substring(index);
		System.out.println(extension);
		if (extension.equals(".java")) {
			System.out.println("他是java文件");
		}else{
			System.out.println("它不是java文件");
		} 
		
		
		//我想判定该文件是否是一个.java文件
		/*String file="李昊阳别说话.mp3";
		int index=file.lastIndexOf(".java");
		if (index>=0) {
			System.out.println("是一个java文件");
		}else{
			System.out.println("不是java文件");
		}*/

		/*//我想判定该文件是否是一个java文件
        String file="李昊阳别说话.mp3";
        int index=file.lastIndexOf(".");
        String extension = file.substring(index);
        System.out.println(extension);
        if (extension.equals(".java")) {
			System.out.println("他是java文件");
		}else{
			System.out.println("它不是java文件");
		} */
		
		
	}



	

}

package cn.happy.homewor;

public class T2 {

	public static void main(String[] args) {
		// 1��100֮������֣��ж����ǲ���7�ı�����������ǣ���ӡ����Ļ��
		//��һ�����������ӡ���ǵ� ��������
		int count=0;
		int sum=0;
		for (int i = 1; i <=100; i++) {
			if (i%7!=0) {
				sum+=i;
				count++;
				System.out.print(i+"\t");
				if (count%4==0) {
					System.out.println();
				}
				
			}
		}
		System.out.println();
		System.out.println(sum);
	}

}

package cn.happy.day02;
/**
 * ѧ��������
 * @author Happy
 *
 */
public class StudentManager {
	//null Java��   DB ��֪��
    public String[] names=new String[5];
    //01.���ѧ����Ϣ
    public void addStudent(String name){
    	//��ι�����name����  ��ô�ܳ�Ϊ�����е�һ��
    	//Java�ַ������   �� "" �Ա� ��ʹ��  equals
    	//Java��null�Ա�  ����==
    	for (int i = 0; i < names.length; i++) {
			if(names[i]==null){//��ǰλ��Ϊ�գ���ӵ�name��Ӧ�÷ŵ����λ��
				names[i]=name;
				break;
			}
		}
    }
    //02.��ӡѧ����Ϣ
    public void printStuInfo(){
    	for (int i = 0; i < names.length; i++) {
    		if (names[i]!=null) {
    			System.out.println(names[i]);
			}
			
		}
    }

    //03.����ָ�������ѧԱ�Ƿ���ڣ�������start end name    1,3
    public boolean search(int start,int end,String name){
    	boolean flag=false;//û���ҵ�
    	for (int i =start-1; i <end; i++) {
			if (name.equals(names[i])) {
				flag=true;
				break;
			}
		}
    	return flag;
    }
    
    //04.дһ���޸�ѧ������Ϣ�ķ���  ����� ���� һ��ѧ������
    public void updateStudent(String oldname,String newName){
    	boolean flag=false;//û�ҵ�
    	//01.�����ž����ƶԱ�������ÿһ�����ƣ��������ƥ��ģ��ͽ���������ֵ��ֵ�������ơ�
    	for (int i = 0; i < names.length; i++) {
			if(oldname.equals(names[i])){
				//���ھ�����
				names[i]=newName;
				flag=true;
				break;
			}
		}
    	if(flag==false){
    		System.out.println("��ү���±��˰ɣ������Ʋ�����ѽ");
    	}
    	//02.���û�о����ƣ�������˼������������ѧ����û�У���̸�޸��أ�
    }
    
    
    
    
    
    
    
    
    
    
    public boolean searchOld(int start,int end,String name){
    	boolean flag=false;//û���ҵ�
    	for (int i =start-1; i <end; i++) {
			if (names[i]!=null) {
				if (names[i].equals(name)) {
					flag=true;
					break;
				}
			}
		}
    	return flag;
    }
    
}

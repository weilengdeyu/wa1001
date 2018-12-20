package cn.happy.day02;
/**
 * 学生管理类
 * @author Happy
 *
 */
public class StudentManager {
	//null Java空   DB 不知道
    public String[] names=new String[5];
    //01.添加学生信息
    public void addStudent(String name){
    	//入参过来的name变量  怎么能称为数组中的一项
    	//Java字符串相等   和 "" 对比 ，使用  equals
    	//Java中null对比  ，用==
    	for (int i = 0; i < names.length; i++) {
			if(names[i]==null){//当前位置为空，添加的name就应该放到这个位置
				names[i]=name;
				break;
			}
		}
    }
    //02.打印学生信息
    public void printStuInfo(){
    	for (int i = 0; i < names.length; i++) {
    		if (names[i]!=null) {
    			System.out.println(names[i]);
			}
			
		}
    }

    //03.查找指定区间的学员是否存在？？？？start end name    1,3
    public boolean search(int start,int end,String name){
    	boolean flag=false;//没有找到
    	for (int i =start-1; i <end; i++) {
			if (name.equals(names[i])) {
				flag=true;
				break;
			}
		}
    	return flag;
    }
    
    //04.写一个修改学生生信息的方法  ，入参 过来 一个学生姓名
    public void updateStudent(String oldname,String newName){
    	boolean flag=false;//没找到
    	//01.我拿着旧名称对比数组中每一个名称，如果发现匹配的，就将数组该项的值赋值成新名称。
    	for (int i = 0; i < names.length; i++) {
			if(oldname.equals(names[i])){
				//存在旧名称
				names[i]=newName;
				flag=true;
				break;
			}
		}
    	if(flag==false){
    		System.out.println("大爷，懵逼了吧！就名称不存在呀");
    	}
    	//02.如果没有旧名称，不好意思：数组中连该学生都没有，何谈修改呢？
    }
    
    
    
    
    
    
    
    
    
    
    public boolean searchOld(int start,int end,String name){
    	boolean flag=false;//没有找到
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

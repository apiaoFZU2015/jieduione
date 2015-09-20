class Human
{
	int age;
	String name;
	String sex;
	void setItem(int a,String b,String c)
	{
		age=a;
		name=b;
		sex=c;
	}
	void showInfo()
	{
		System.out.println("年龄："+age+" 姓名："+name+" 性别："+sex);
	}
}
public class Demo1
{
	public static void main(String[] args){
	/*int a=3;
	switch(a){
	case 1:System.out.println("还有谁！");break;
	case 2:System.out.println("傻逼！");break;
	default:System.out.println("呵呵！");
	}*/
		//int i=0;
		/*do{
		System.out.println("*****");
		i++;
	}while(i<10);*/
	/*while(i<10)
	{
	System.out.println(i);
	i++;
	}*/	
		
		Human human1=new Human();
		Human human2=new Human();
		Human human3=new Human();
		human1.setItem(40,"萨摩","女");
		human2.setItem(25,"哈士","男");
		human3.setItem(15,"金毛","男");
		human1.showInfo();
		human2.showInfo();
		human3.showInfo();
	}
	
}

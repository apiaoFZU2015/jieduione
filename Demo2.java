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
		System.out.println("���䣺"+age+" ������"+name+" �Ա�"+sex);
	}
}
public class Demo1
{
	public static void main(String[] args){
	
		
		Human human1=new Human();
		Human human2=new Human();
		Human human3=new Human();
		human1.setItem(40,"��Ħ","Ů");
		human2.setItem(25,"��ʿ","��");
		human3.setItem(15,"��ë","��");
		human1.showInfo();
		human2.showInfo();
		human3.showInfo();
	}
	
}

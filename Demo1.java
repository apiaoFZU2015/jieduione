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
	/*int a=3;
	switch(a){
	case 1:System.out.println("����˭��");break;
	case 2:System.out.println("ɵ�ƣ�");break;
	default:System.out.println("�Ǻǣ�");
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
		human1.setItem(40,"��Ħ","Ů");
		human2.setItem(25,"��ʿ","��");
		human3.setItem(15,"��ë","��");
		human1.showInfo();
		human2.showInfo();
		human3.showInfo();
	}
	
}

package Switch_control_statment;

public class example1    //stastic regular method from same class /non-Stastic regular method from same class 
{
	public static void main(String[] args)     //main method 
	{
		
		m1();
		example1 D=new example1();
		D.m2();
		
	}

public static void m1()             //Static regular method from same class
{
	System.out.println("Stastic regular method from same class");
	
}
public  void m2()               //non-static regular method
{
	System.out.println("non-stastic regular method m2 from same class");
}
}


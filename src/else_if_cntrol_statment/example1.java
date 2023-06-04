package else_if_cntrol_statment;
//if the multiple condtion is used then then else_if cntrol method are used.
//it is basically more than used in condition more than 2nos.

public class example1 
{
	public static void main(String[] args) 
	{
		int marks=50;
		if(marks>=67)   //condition first
		{
			System.out.println("first class with distincation");
		}
		else if(marks>=60 & marks<=66)  //second condition
		{
			System.out.println("first class");
		}
		else if(marks>=55 & marks<=59)  //condition 3rd
		{
			System.out.println("higher sendary class");
		}
		else if(marks>=50 & marks<=54)
		{
			System.out.println("senodary class");
			
		}
		else if  (marks>=49 & marks<=40)
		{
			System.out.println("pass");
		}
		
		
	}

}

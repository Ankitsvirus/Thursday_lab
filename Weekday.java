import java.util.Scanner;
public class Weekday
{
	public static void main(String args[])
	{
		int Weekday; 
		System.out.println("DAY NUMBER IS :");
		Scanner scan=new Scanner(System.in);
		Weekday = scan.nextInt();
		if(Weekday==1)
		{
			System.out.println("THE DAY IS MONDAY");
		}
		else if(Weekday==2)
		{
			System.out.println("THE DAY IS TUESDAY");
		}
		else if(Weekday==3)
		{
			System.out.println("THE DAY IS WEDNESDAY");
		}
		else if(Weekday==4)
		{
			System.out.println("THE DAY IS THURSDAY");
		}
		else if(Weekday==5)
		{
			System.out.println("THE DAY IS FRIDAY");
		}
		else if(Weekday==6)
		{
			System.out.println("THE DAY IS SATURDAY");
		}
		else if(Weekday==7)
		{
			System.out.println("THE DAY IS SUNDAY");
		}
	}
}
package Test6;
import java.util.Scanner;
public class SwapNumber {
	
	
		int a,b;
		public void swapNum(SwapNumber stn){
			int temp;
			temp=stn.a;
			stn.a=stn.b;
			stn.b=temp;
		}
		public static void main(String args[]){
			SwapNumber sn=new SwapNumber();
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the first number:");
			sn.a=sc.nextInt();
			System.out.println("enter the second number:");
			sn.b=sc.nextInt();
			sn.swapNum(sn);
			System.out.println("after swapping:a="+sn.a+"b="+sn.b);
		}
	}


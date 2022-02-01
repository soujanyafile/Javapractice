package Loopseries;
import java.util.Scanner;

public class Continoue {

/*	public static void main(String[] args) {*/
	/*int i=1;
	while(i<10) {
		if(i==5)
		{
			
		break;
		}
		
	
	System.out.println(i);
	i++;
	}
	{
	System.out.println("Hello");
}
}
	}*/

/*Scanner S=new Scanner(System.in);
System.out.println("enter 2 number");
int a=S.nextInt();
int b=S.nextInt();
int c=a+b;
System.out.println("Sum is"+c);
	}
}*/
public static int Sum(int a,int b)
{
	int c=a+b;
	return c;
	
}
public static void main(String[] args) {
	Scanner Sc=new Scanner(System.in);
	System.out.println("enter 2 numbers");
	int a =Sc.nextInt();
	int b =Sc.nextInt();
	int Sum=Sum(a,b);
	System.out.println("Sum of the numbers is"+Sum);
}
}
	


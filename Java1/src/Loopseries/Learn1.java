package Loopseries;
import java.util.*;
public class Learn1 {

	public static void main(String[] args) {
		/*int n=4;
		boolean prime=true;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				prime=false;
			}
		}
if(prime==true)
{
	System.out.println(n+"is prime");
}
else
	System.out.println(n+"is not prime");
	}

*/
		/*int n=10;
		for(int i=2;i<n;i++) {
			boolean prime=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					prime=false;
				}
			}
			if(prime==true) {
				System.out.println(i+"is prime");
			}
			else
				System.out.println(i+"is not prime");
			
			}
				}
			}*/
		/*int n=10;
		int sum=0;
		for(int i=2;i<n;i++) {
			boolean prime=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					prime=false;
				}
			}
			if(prime==true) {
				sum=sum+i;
				i++;
				System.out.println(sum);
			}
		}
	}
}
		*/
/*int[]a= {1,2,3,4};{
System.out.println(a[a.length-2]);
}
	}
}*/
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the values");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		}
}
	*/	
		/*int n=5;
		int fact=1;
		int i=1;
		while(i<=n) {
			fact=fact*i;
		}
			i++;
			System.out.println(fact);
		}
	}
*/
		/*char A=65;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				
				System.out.print(A);
				
			}
			System.out.println();
			A++;
		}

	}
}*/
		String s="kunal";
		for(int i=s.length()-1;i>=0;i--) {
			System.out.println(s.charAt(i));
		}
	}
}

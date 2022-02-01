
public class Even_in_range {

	public static void main(String[] args) 
	{
		/*for(int a=1;a<=10;a++)
	
			if(a%2==0) 
			{
			System.out.println(a);
		}

	}*/
			/*for(int a=1;a<=10;a++)
				{
					if(a%2!=0) 
					{
					System.out.println(a);
}
}*/
		/*for(int a=1;a<=10;a++)
		{
			System.out.println(a);
		}*/
		int n=12;
		boolean flag=true;
		{
		for(int i=2;i<n;i++)
			{
				if (n%i==0)
				{
					flag=false;
				}
				}
		}
				if (flag==true)
				{
					System.out.println(n+"is prime");
				}
				else
					System.out.println(n+"is not prime");
		}
	}





package Loopseries;

public class Sum {

	public static void main(String[] args) {
		/*int i=1;
		int sum=0;
		while (i<=10)
		{
			sum=sum+i;
			i++;
			{
				System.out.println("sum is"+sum);
			}

	}

}
} */
	for (int i=1;i<=10;i++)
	{
		
	int fact=1;
	for(int j=i;j>=1;j--)
	{
		fact =fact*j;
	}
	System.out.println(fact);
	}

}
}
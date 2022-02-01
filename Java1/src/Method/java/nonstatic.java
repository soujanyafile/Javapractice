package Method.java;

public class nonstatic {
	int a;
	{
		a=10;
		System.out.println(a);
	}
	{
		System.out.println(a);
	}
	

	public static void main(String[] args) {
		nonstatic c1=new nonstatic();
		System.out.println("main()");
		nonstatic c2=new nonstatic();
		

	}

}
	/*int a=10;
	{
		int a=20;
		System.out.println(a);
	}
	{
		int a=30;
		System.out.println(this.a);
	}
	

	public static void main(String[] args) {
		nonstatic c1=new nonstatic();
		
		

	}

}*/
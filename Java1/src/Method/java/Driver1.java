package Method.java;

public class Driver1 {

	public static void main(String[] args) {
		Aa.a=10;
		Aa.b=20;
		Aa.c=30;
		int b=20;
		System.out.println(Aa.b);
		Aa c1=new Aa();
		System.out.println(c1.b);
		Aa c2=new Aa();
		System.out.println(c2.b);
		Aa.Add(10,20,30);

	}

}

package Loopseries;

 class Bike {
	 String name;
	 String brand;
	 int cc;
	 Bike (String name,String brand,int cc){
		 this.name=name;
		 this.brand=brand;
		 this.cc=cc;
		 System.out.println(this.name);
		 System.out.println(this.brand);
		 System.out.println(this.cc);
	 }

	public static void main(String[] args) {
		Bike b=new Bike("Duke","KTM",390);
		Bike b1=new Bike("Pulsar","Bajaj",200);
		

	}

}

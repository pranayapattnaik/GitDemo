package corejava1;

public class StaticVar {
	
	//instance variables
	// these variables changes from object to object
	String name;
	String address;
	//when we declare any variable as static then that variable is part of the class not object
	//class variables
	static String city = "Bangalore";// when you treat any variable as static then that variable copy is shared by all the objects
	static int i = 0;
	
	//static block - we can initialize all the static variables at once using static
	/*
	 * static { String city ="Bangalore"; int i = 0; }
	 */
	
	StaticVar(String name, String street)//local variables
	{
		// we are assigning the local variable to instance variable
		//this.instance variable = local variable
		this.name= name;
		this.address = street;
		i++;
		System.out.println(i);
	}
	
	public void getAddress()
	{
		System.out.println(address + " " + city); 
	}
	
	//static method should only have static varibles
	public static void getCity()
	{
		System.out.println(city);
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		StaticVar obj = new StaticVar("Rahul","Marathali");
		StaticVar obj1 = new StaticVar("Ram","JayaNagar");
		obj.getAddress();
		obj1.getAddress();
		//static keywords are independent of object as these are class dependent
		//Hence we can call the static variables or methods using Class
		StaticVar.getCity();
		StaticVar.i=4;
		getCity();
	}

}

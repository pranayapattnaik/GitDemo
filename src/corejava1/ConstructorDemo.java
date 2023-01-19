package corejava1;

public class ConstructorDemo {

		//Default constructor
	  	public ConstructorDemo() 
	    {
		  //constructor executes a block of code whenever anobject is created 
		  //constructor doesnt return any values like methods
	  //construcotr name should be sasme as Class name
	  
		  System.out.println("i am in constructor"); 
		  System.out.println("i am also in constructor"); 
	    }
	  	
	  	//Parameterized constructor
	  	public ConstructorDemo(int a,int b)
	  	{
	  		System.out.println("I am in parameterised constructor");
	  		System.out.println(a);
	  	}
	  	
	  	public ConstructorDemo(String str)
	  	{
	  		System.out.println(str);
	  	}
	  	
		public void getData()
		{
			System.out.println("I am a method");
		}
		
		public static void main(String[] args) {
			
			ConstructorDemo cd = new ConstructorDemo();
			ConstructorDemo cd1 = new ConstructorDemo("hello");
			ConstructorDemo pd = new ConstructorDemo(4,5);
			cd.getData();// but the methods need to be called to if you need iit
			//whenever you create an object the default constructor is called without even calling
			//compiler will call default or implicit constructor if you don't define any constructor
			//but the parameterized constructor is not called by default
			

	}

}

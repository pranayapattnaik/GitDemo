package corejava1;

public class ChildDemo extends ParentDemo {

	String name = "QAClickAcademy";
	
	public void getStringData()
	{
		System.out.println(name);
		System.out.println(super.name);
	}
	
	public void getData()
	{
		System.out.println("I am in Child Class");
		super.getData();
	}
	
	public ChildDemo()
	{
		super();//this should be always at first line for the constructors only//Constructor call must be the first statement in a constructor
		System.out.println("I am in Child Constructor Class");
		
	}
	
	public static void main(String[] args) {
		ChildDemo cd = new ChildDemo();
		cd.getStringData();
		cd.getData();

	}

}

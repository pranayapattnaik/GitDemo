package corejava;

public class ChildClassDemo extends ParentClassDemo{

	int i = 20;
	
	public void audioSystem()
	{
		System.out.println("New AudioSystem");
	}
	
	public void engine()
	{
		System.out.println("New generation enegine");
	}
	
	public void colour()
	{
		System.out.println(colour);
		System.out.println("Change by Gitstuff");
		System.out.println("Change by Gitstuff");
	}
	
	public static void main(String[] args) {
		ChildClassDemo cd = new ChildClassDemo();
		cd.colour();
		cd.brakes();
		System.out.println(cd.i);
		cd.audioSystem();

	}

}

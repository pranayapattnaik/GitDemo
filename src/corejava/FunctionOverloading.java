package corejava;

public class FunctionOverloading {
	
	public void tDatssa(int a)
	{
		System.out.println(a);
	}
	public void gDasfata(int a)
	{
		System.out.println(a);
	}
	
	
	
	public void getData(int a)
	{
		System.out.println(a);
	}
	
	public void getData(String a)
	{
		System.out.println(a);
	}
	
	public void getData(int a, int b)
	{
		System.out.println(b);
	}
	
	public static void main(String[] args) {
	// function overloading - same class with multiple methods with same name
	// Rules for function overloading i.e multiple methods with same name
	//either argument count should be different
	//argument dataType should be different
		FunctionOverloading fo = new FunctionOverloading();
		fo.getData(2);
		fo.getData("Hello");
		fo.getData(5, 6);
	}

}

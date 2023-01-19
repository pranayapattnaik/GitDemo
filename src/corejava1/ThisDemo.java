package corejava1;

public class ThisDemo {

	int a= 2;
	
	public void getData()
	{
		int a = 3;
		System.out.println(this.a);//this refers to current object and this object scope lies in class level
		System.out.println(a);
		System.out.println(a+this.a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisDemo td = new ThisDemo();
		td.getData();
	}

}

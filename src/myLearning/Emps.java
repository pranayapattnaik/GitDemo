package myLearning;


public class Emps extends Persons{  
	float salary;  
	Emps(int id,String name,float salary){  
	super(id,name);//reusing parent constructor  
	this.salary=salary;  
	}  
	void display(){System.out.println(id+" "+name+" "+salary);
	}  
	

	public static void main(String[] args){  
		Emps e1=new Emps(1,"ankit",45000f);  
		e1.display();  
	}}  
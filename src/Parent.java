import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;


class Super {

	final int MAX_VALUE;
	
	public Super() {
		
		MAX_VALUE=2000;
	}

	public Super(int value) {
		MAX_VALUE=value;

	}
	protected void display() throws FileNotFoundException {

		System.out.println("Super:display()");
	}
	 void demo(){
		System.out.println("XYZ Class Method");
	} 

}
// sub class overridden method can not  narrow down the access modifier. example like super class public can not 
// be protected in subclss  but super class protected can  be public in subclass 

// Exception: super class method exception can be broader than subclass but subclass exception can be narrowed
class Child extends Super{


	public void display() throws FileNotFoundException{ 
		// TODO Auto-generated method stub
		System.out.println("Child:display()");
		
	}
	
	public void demo(){
		System.out.println("XYZ Class Method");
	}  

	
}

public class Parent {

	public static void main(String args[]) throws Exception {
		
		Super s = new Child();
		Super s1 = new Super(1000);
		s.display();
		s1.display();
		System.out.println(s.MAX_VALUE);
		
		List<String> lst=new LinkedList<String>();
		lst.add("hemant");
		
	}
	
}




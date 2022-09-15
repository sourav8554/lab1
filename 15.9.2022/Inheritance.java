package operators1;


	class A {
	    public void print_A() { System.out.println("Class A"); }
	}
	 
	class B extends A {
	    public void print_B() { System.out.println("Class B"); }
	}
	 
	class C extends A {
	    public void print_C() { System.out.println("Class C"); }
	}
	 
	
	// Driver Class
	public class Inheritance {
	    public static void main(String[] args)
	    {
	        B obj_B = new B();
	        obj_B.print_A();
	        obj_B.print_B();
	 
	        C obj_C = new C();
	        
	        obj_C.print_C();
	 
	       
	    }
	}



public class HelloWorld {
	// member variables
	
	
	// member functions / method
	
	private static int i; // made me do this for the do while loop further down

	// main method - this will start the project
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello World");
		
		double d = Math.random();
		
		System.out.println("The random no is :" + d);
		
		// int i = 0; // yellow lines are warnings, things you should think about
		int j = 100; // int is a basic type
		double f = 1.0;
		double d2 = 3.14159; // naming variables, letters , numbers , can use underscore but not dashes, first character must be a letter
		int my_int = 100;
		
		int aLowerCamelCaseVariable = 100; // variable naming convention, don't use underscores, first letter lowercase, subsequent letters in capitals
		
		
		// int answer = i + 100;
		
		boolean b = true; // boolean has key words associated with it - true and false in Java
		boolean c = false;
		
		String s = "This is a string";  // string is a complex type
		
	    System.out.println(s.toUpperCase());          // functions associated with string types
		
		// control and space is a shortcut for intelesense
	    
	    System.out.println(s.length());
	    
	    int[] iArray = new int[10] ;
	    int[] iArray2 = {1, 2, 3, 4, 5}; //can declare and populate array in one go
	    
	    String[] months = {"Jan", "Feb", "Mar",
	    					"Apr", "May", "Jun",
	    					"Jul", "Aug", "Sep",
	    					"Oct", "Nov", "Dec"}; // Java ignores all white space
	    
	    for (int i = 0; i< months.length; i++); {
	    	
	    
			System.out.println(months[i]);
	    }
		
	    int i=0;
	    while (i < months.length);{
	    	
	    	System.out.print(months[i] + " ");
	    	i++;
	    }
	    
	    i = 0;
	    do {
	    	System.out.println(months[i] + " ");
	    	i++;
	    	} while (i < months.length);
	    
	    // now creating the same thing backwards
	    
	   i = 11;
	   do {
		   System.out.print(months[i] + " ");
		   i--;
		   if (i == 2 || i ==5 || i == 8 || i == 11) {
			   System.out.println();
		   }
		   
		   boolean answer = true;
		   if (i == 2 && answer == false) {
		  
		   } 
		   
		   if (i != 4) {
			   // i is not equal to 4
		   }
		   
		   
		  
	   
	   
	   }
	   while (i >= 0);
	}
	}
	   


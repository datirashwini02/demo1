package pack1;
import java.util.scanner;
import java.util.*;

public class marks {
	
	public static void main(String[] args) {
		int marks;
		  
		    Scanner s = new Scanner(System.in);
		    System.out.println("Enter your marks: ");
		    marks =s.nextInt();
		    String result = (marks > 40) ? "pass" : "fail";

		    System.out.println("You " + result + " the exam.");
		    
		  
	}
}

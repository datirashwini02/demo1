package pack1;
import java.util.*;
public class PositiveNegativeTest {

	public static void main(String[] args) {
		int a=6;
	
			
				Scanner s = new Scanner(System.in);
				System.out.println("Enter number to test");
				int number = s.nextInt();
				
				String result = number>0 ? "Positive" : "Negative";

				System.out.println(number +" is "+ result);	

			

	}

}

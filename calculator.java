package pack1;
//write program to create java application for calculator 
public class calculator
{

int x;
int y; 

void add()
{
	x=10;
	y=20;
	System.out.println(" sum= "+ (x+y));
}
void subtract()
{
	x=33;
	y= 23;
	System.out.println("difference"+ (x-y));
	
}
public static void main(String[] args) {
	calculator cal= new calculator();// we created class instance
	
	
	cal.add();
	cal.subtract();

	



}

}

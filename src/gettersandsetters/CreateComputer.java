/*- Create a Computer class that has 3 variables. 
 * The first variable will have a name. 
 * The second variable will be the year of the computer. 
 * Last variable will be the cost of the computer.

- All 3 variables should be private instance variables and must use getters to retrieve the data and setters to set the variables.
*/


package gettersandsetters;

import java.util.Scanner;
public class CreateComputer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String computer= "AMD RYzen";
		
		//System.out.printf("%s", computer);
		Scanner uInput = new Scanner(System.in);
		Computer desktopOne = new Computer();
		
		System.out.println("Enter the brand name of your computer\n");
		
		String name = uInput.nextLine(); // this will be used as input to receive use input from the keyboard 
		char 
		desktopOne.setName(name);
		
		
		
		System.out.printf("Brand name entered the for the compute %s",desktopOne.getName()); // Will be using C inspired library to format the variables cleanly 
		
	}

}

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
		
		System.out.println("Enter the year this model was released");
		String releaseDate = uInput.next();
		
		System.out.println(" Enter the cost of you computer ");
		float price = uInput.nextFloat();
	
		
		desktopOne.setName(name);
		System.out.printf("Brand name entered the for the computer %s\n",desktopOne.getName()); // Will be using C inspired library to format the variables cleanly 
		
		desktopOne.setYear(releaseDate);
		System.out.printf("Release date of the is machine was %s\n", desktopOne.getYear());
		
		desktopOne.setCost(price);
		System.out.printf("%.2f The cost of the computer is", desktopOne.getCost());

		
	}

}

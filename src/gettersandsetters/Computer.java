/*- Create a Computer class that has 3 variables. 
 * The first variable will have a name. 
 * The second variable will be the year of the computer. 
 * Last variable will be the cost of the computer.

- All 3 variables should be private instance variables and must use getters to retrieve the data and setters to set the variables.
*/

package gettersandsetters;

public class Computer {
	
	private String name;
	
	private String year;
	
	float cost;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}
}

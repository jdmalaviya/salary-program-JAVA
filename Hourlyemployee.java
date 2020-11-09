package project;

public class Hourlyemployee extends Employee{
	// five-argument constructor
	

	public Hourlyemployee(String first, String last, String ird, double d, int i) {
		super(first, last, ird);
		
		// TODO Auto-generated constructor stub
	}

	private double wage; // wage/hour
	private double hours; // hours/week
	
	//get and set method
	
	// set wage
	public void setWage( double hourlyWage )
	{
       wage = ( hourlyWage < 0.0 ) ? 0.0 : hourlyWage;
	} // end method setWage

	// return wage
	public double getWage()
	{
		return wage;
	} // end method getWage
	
	// set hours worked
	public void setHours( double hoursWorked )
	{
		hours = ( ( hoursWorked >= 0.0 ) && (hoursWorked <= 168.0 ) ) ? hoursWorked : 0.0;
	} // end method setHours
	
	// return hours worked
	public double getHours()
	{
		return hours;
	} // end method getHours

	// calculate earning
	public double earnings()
	{	
		if ( getHours() <= 40 )  // no overtime
			return getWage() * getHours();
		else
			return 40 * getWage() + ( getHours() - 40 ) * getWage() *1.5;
   } // end method earnings
   
	// return String representation of HourlyEmployee object
	public String toString()
	{
		return String.format("hourly employee: %s\n%s: $%,.2f; %s: %,.2f",super.toString(), "hourly wage", getWage(),"hours worked", getHours() );
	} // end method toString

} // end class HourlyEmployee
	




package project;

public class Salariedemployee extends Employee
{
	private double weeklySalary;

	// SalariedEmployee's argument constructor
	public Salariedemployee( String first, String last, String ird,double salary )
	{
		super( first, last, ird ); 								// pass to Employee constructor
		setWeeklySalary( salary ); 								// validate and store salary
	} 															// end SalariedEmployee constructor
	
																// set setWeeklySalary method
	public void setWeeklySalary( double salary )
	{
		weeklySalary = salary < 0.0 ? 0.0 : salary;
	} 															// end method setWeeklySalary
	
																// return getWeeklySalary method
	public double getWeeklySalary()
	{
		return weeklySalary;
	} 															// end method getWeeklySalary
	
																// in Employee
	public double earnings()
	{
		return getWeeklySalary();
	} 															// end method earnings

																// return String representation of SalariedEmployee object
	public String toString()
	{
		return String.format( "salaried employee: %s\n%s: $%,.2f",
		super.toString(), "weekly salary", getWeeklySalary() );
	} 															// end method toString

} // end class SalariedEmployee
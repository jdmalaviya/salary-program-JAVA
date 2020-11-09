package project;

public class Basepluscommissionemployee extends Commissionemployee{


	private double baseSalary; 										// base salary per week
 
	// BasePlusCommissionEmployee argument constructor
	public Basepluscommissionemployee( String first, String last,String ird, double sales, double rate, double salary )
	{
		super( first, last, ird, sales, rate );
		setBaseSalary( salary ); 									// validate and store base salary
	} 																// end BasePlusCommissionEmployee constructor
	
																	// set setBaseSalary method
	public void setBaseSalary( double salary )
	{
		baseSalary = ( salary < 0.0 ) ? 0.0 : salary; 				// non-negative
	} 																// end method setBaseSalary
	
																	// return base salary
	public double getBaseSalary()
	{
		return baseSalary;
	} 																// end method getBaseSalary

																	// calculate earnings
	public double earnings()
	{
		return getBaseSalary() + super.earnings();
	} 																// end method earnings
	
	// return String representation of BasePlusCommissionEmployee
	public String toString()
	{
		return String.format( "%s %s; %s: $%,.2f","base-salaried", super.toString(),"base salary", getBaseSalary() );
	} 																// end method toString

} // end class BasePlusCommissionEmployee

package project;



														// CommissionEmployee class extends Employee.
public class Commissionemployee extends Employee
{
	private double Gross; 								// gross weekly sales
	private double CRate; 								// commission percentage
	
	// CommissionEmployee constructor
	public Commissionemployee( String first, String last,String ird,double sales, double rate )
	{	
		super( first, last, ird );
		try {
			if(CRate >100) {}
			this.Gross=sales;
		}
		catch(Exception e)
		{
			System.out.println("commisiion rate is more than 100");
		}
		this.CRate = rate;
		
	
	} 													// end CommissionEmployee constructor
	
														// set commission rate
	public void setCRate( double rate )
	{
		CRate = ( rate > 0.0 && rate < 1.0 ) ? rate : 0.0;
	} 													// end method setCRate

														// return commission rate
	public double getCRate()
	{
		return CRate;
	} 													// end method getCRate

														// set gross sales amount
	public void setGross( double sales )
	{
		Gross = ( sales < 0.0 ) ? 0.0 : sales;
	} 													// end method setGross
	
														// return gross sales amount
	public double getGross()
	{
		return Gross;
	} 													// end method getGross

 													// calculate earnings
	public double earnings()
	{
		return getCRate() * getGross();
	} 													// end method earnings
	
														// return String representation of CommissionEmployee object
	public String toString()
	{
		return String.format( "%s: %s\n%s: $%,.2f; %s: %.2f","commission employee", super.toString(),"gross sales", getGross(),"commission rate", getCRate() );
	} 													// end method toString
	
} // end class CommissionEmployee
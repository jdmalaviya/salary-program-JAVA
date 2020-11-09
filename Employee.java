package project;


//Employee is the main class which has three data member with same data type (String) with three variable

public abstract class Employee {
	
	private String fName;
	private String lName;
	private String inlandRevenue;


// hear Employee is a constructor with using variable which declared in Employee class
	
	
	public Employee(String first, String last, String ird)
	{
		fName = first;
		lName = last;
		inlandRevenue = ird;
	}
	
	
	//use get and set method for access data member of the class Employee which is private

	public String getfName()
	{
		return fName;
	} 										// end method getfName
	
    										// return last name
	public String getlName()
	{
		return lName;
	} 										// end method getlName

											// return InlandRevenue
	public String getinlandRevenue()
	{
		return inlandRevenue;
	} 										// end method getinlandRevenue
	
											// return String representation of Employee object
	public String toString()
	{
		return String.format( "%s %s\nIRD Number: %s",getfName(), getlName(),getinlandRevenue() );
	} 										// end method toString

											// abstract method overridden by subclasses
	public abstract double earnings();

}											// End of Employee's Abstarct class or Super Class

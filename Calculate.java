package project;


public class Calculate
{
	public static void main( String args[] )
	{
		// create subclass objects
		Salariedemployee salariedEmployee = new Salariedemployee( "John", "Smith", "102-034-506",800.00 );
		Hourlyemployee hourlyemployee = new Hourlyemployee( "Karen", "Price", "113-145-106", 16.50, 40);
		Commissionemployee commissionEmployee = new Commissionemployee("Sue", "Jones", "103-040-606", 10000, .06 );
		Basepluscommissionemployee basePlusCommissionEmployee = new Basepluscommissionemployee("Bob", "Lewis", "104-020-305", 5000, .04, 300 );
     System.out.println( "Employees processed individually:\n" );
     System.out.printf( "%s\n%s: $%,.2f\n\n",salariedEmployee, "earned", salariedEmployee.earnings() );
     System.out.printf( "%s\n%s: $%,.2f\n\n",hourlyemployee, "earned", hourlyemployee.earnings() );
     System.out.printf( "%s\n%s: $%,.2f\n\n",commissionEmployee, "earned",commissionEmployee.earnings() );
     System.out.printf( "%s\n%s: $%,.2f\n\n",basePlusCommissionEmployee,"earned", basePlusCommissionEmployee.earnings() );

     												// create Employee array
     Employee employees[] = new Employee[ 4 ];

     												// initialize array with Employees
     employees[ 0 ] = salariedEmployee;
     employees[ 1 ] = hourlyemployee;
     employees[ 2 ] = commissionEmployee;
     employees[ 3 ] = basePlusCommissionEmployee;
     
     System.out.println("Employees processed polymorphically:\n" );

     												//process each element in array employees
     for ( Employee currentEmployee : employees )
     {
     	System.out.println( currentEmployee ); 		// invokes toString
     	
     												// determine whether element is a BasePlusCommissionEmployee
     	if (currentEmployee instanceof Basepluscommissionemployee )
     	{
     												// downcast Employee reference to
     		
     												// BasePlusCommissionEmployee reference
     		Basepluscommissionemployee employee = ( Basepluscommissionemployee ) currentEmployee;
     		double oldBaseSalary = employee.getBaseSalary();
     		employee.setBaseSalary( 1.10 * oldBaseSalary );
     		System.out.printf("new base salary with 10%% increase is: $%,.2f\n",employee.getBaseSalary() );
     	} 											// end if loop
     	
			System.out.printf("earned $%,.2f\n\n", currentEmployee.earnings() );
     }												// end for loop

     												// get type name of each object in employees array
     for ( int j = 0; j < employees.length; j++ )
     	System.out.printf( "Employee %d is a %s\n", j,employees[ j ].getClass().getName() );
     } 												// end main
} // end class SalaryCount 

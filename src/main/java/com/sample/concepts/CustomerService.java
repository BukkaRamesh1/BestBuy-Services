/**
 * 
 */
package com.sample.concepts;

/**
 * @author rameshbukka
 *
 */
public class CustomerService {
	
	/*
	 * 
	 *  when we dec;lare class the first letter should be capital
	 *  when we declare a variable the first leeter should be small and followed by the next word first letter iss capital
	 * 
	 *  variable declarations
	 *  and methods or functions to perform business logic
	 *  
	 *  assume i want to add the customer info into database of X
	 *  
	 *  //JSON Format data and other is XML format
	 *  //when we work with restful application developmemnt we use JSON format data
	 *  if it's web application then the data can be JSON or XMl format
	 *  
	 *  To consume JSON data we use REST API
	 *  To consume XML data we use SOAP API architecture
	 *  
	 *  {
	 *    "key" : "value"
 : 	 *     "customerId" : 1,
           "customerName"  : "RameshB",
           "customerAddress" : VA
           "customerNumber" : 12345678
           "status" : true
	 *  }
	 *  
	 * 
	 *   declaring a varibales for customer
	 *   
	 *   public is access specifier default, public, private, protected
	 *   Long is datatype of variable      int, float, boolean, double, long, string, short, char 
	 *   
	 * 
	 */
	
	   // variables declaration
	// data types
	// type conversion
	 
	  
	  // we create a model or plain java class and keep only the info of any item.
	
	  //method to add customer data
	  public static void createCustomer(Customer customer) {
		  
		 // crreatinf object for customer to access the variables

		  String name = customer.getCustomerName();
		  System.out.println("@@@ "+name);
		  
		  // I want to convert the string data type to boolean for any converions we use WRAPPER class and cast the data
		  String a = "true";
		  boolean b = Boolean.parseBoolean(a); // wrapper class
		  System.out.println(b);
		  
		  long num = customer.getCustomerNumber();
		  int n;
		  // convert long value to int
		  n = (int)num;
		  
		  TestWrapper wrap = new TestWrapper(1);
		  
		  
		  // read the data and save into database
		  
		  
 	  }
	
	  public static void main(String[] args) {
		  Customer cust = new Customer(); // this is one way to create object
		  cust.customerId = 1;
		  cust.setCustomerName("John");
		  cust.customerAddress = "VA";
		  cust.setCustomerNumber(12345678L);
		  cust.status = true;
		  
		  
		  createCustomer(cust);
		  
		
	}
	  
	  
	  
	

}

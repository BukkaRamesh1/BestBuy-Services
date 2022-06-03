package com.sample.concepts;



// this class we can say as plain java objcet POJO/Model class
public class Customer {
	
	  public int customerId;
	  private String customerName;
	  public String customerAddress;
	  private Long customerNumber;
	  public boolean status;
	  
	  
	  
	  public String getCustomerName() {
		  return customerName;
	  }
	  
	  
	  public void setCustomerName(String customerName) {
		  this.customerName = customerName;
	  }


	public Long getCustomerNumber() {
		return customerNumber;
	}


	public void setCustomerNumber(Long customerNumber) {
		this.customerNumber = customerNumber;
	}
	  
	  

	  
	  
}

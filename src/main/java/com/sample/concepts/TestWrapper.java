package com.sample.concepts;

public class TestWrapper {
	
	/*
	 *  declare variables as private
	 *  generate constructors of default and parameters
	 *  generate getter setter methods
	 *  generate toString method
	 * 
	 * 
	 */
	
	private int number;
	private int sum;
	
	// default constructor
	TestWrapper() {
		
	}
	
	//paramtersed constructor
	TestWrapper(int number){
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number, int sum) {
		this.number = number;
		this.sum =sum;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TestWrapper [number=");
		builder.append(number);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	

}

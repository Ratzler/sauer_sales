package sauer_sales_model;

public class Customer 
{
	private int customer_ID;
	private String firstName;
	
	
	public int getCustomer_ID() {
		return customer_ID;
	}
	public void setCustomer_ID(int customer_ID) {
		this.customer_ID = customer_ID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public Customer(int customer_ID, String firstName) {
		setCustomer_ID(customer_ID);
		setFirstName(firstName);
	}
	
	
}

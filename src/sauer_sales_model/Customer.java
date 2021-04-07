package sauer_sales_model;

public class Customer 
{
	private int customer_ID;
	private String firstName;
	private double credit;
	
	
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
	
	
	
	public double getCredit() {
		return credit;
	}
	public void setCredit(double credit) {
		this.credit = credit;
	}
	public Customer(int customer_ID, String firstName, double credit) {
		super();
		this.customer_ID = customer_ID;
		this.firstName = firstName;
		this.credit = credit;
	}
	
	
	
	
}

package sauer_sales_model;

import java.util.ArrayList;

public class Customers 
{
	
	private ArrayList<Customer> customers;

	public ArrayList<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(ArrayList<Customer> customers) {
		this.customers = customers;
	}

	public Customers(ArrayList<Customer> customers) {
		setCustomers(customers);
	}
	
	
}

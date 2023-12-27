package TestHibernate.Bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {

	@Id
	@Column(name="customer_id")
	private int customerId;
	private String customerName;
	private String customerCity;
	private long phoneNo;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerCity="
				+ customerCity + ", phoneNo=" + phoneNo + "]";
	}
	public Customer(int customerId, String customerName, String customerCity, long phoneNo) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerCity = customerCity;
		this.phoneNo = phoneNo;
	}
	public Customer() {
		
	}
	
	
	
	
	
}

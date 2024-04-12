package serialization;

import java.io.Serializable;

class Employee implements Serializable{
	   /**
	 * 
	 */
	//private static final long serialVersionUID = 11L;
	private String     firstName;
	private String     lastName;
	private  String confidentialInfo; //make this transient in the demo2

	   public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getConfidentialInfo() {
		return confidentialInfo;
	}
	public void setConfidentialInfo(String confidentialInfo) {
		this.confidentialInfo = confidentialInfo;
	}
	
	   public Employee(String firstName, String lastName, String confidentialInfo) {
		   this.firstName=firstName;
		   this.lastName=lastName;
		   this.confidentialInfo=confidentialInfo;
	   }
}


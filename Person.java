import java.time.LocalDate;
import java.time.Period;

public class Person 
{
	/*
	 * name 
	 * address
	 * DOB
	 * phone number
	 * gender
	 * emailID
	 * 
	 */
	private String name;
	private Address address;
	private LocalDate dateOfBirth;
	private String phoneNumber;
	private Gender gender;
	private String emailId;

	
	
	
	public Person(String name, Address address, LocalDate dateOfBirth, String phoneNumber, Gender gender) 
	{
		
		this.name = name;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
	}

	public Person(String name, Address address, LocalDate dateOfBirth, String phoneNumber, Gender gender,
			String emailId) 
	{
		this.name = name;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
		this.emailId = emailId;
	}

	public int getAge()
	{
		Period p = Period.between(dateOfBirth,LocalDate.now());
		return p.getYears();
	}
	
	public String getName() {
		return name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public String getPhoneNumber() 
	{
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) 
	{
		this.phoneNumber = phoneNumber;
	}
	public Gender getGender() 
	{
		return gender;
	}
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
}

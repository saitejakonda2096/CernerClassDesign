
public class Address 
{
	String street;
	long zipcode;
	String city;
	String state;
	String country;
	String aptNo;
	
	public Address(String street, long zipcode, String city, String state, String country, String aptNo) 
	{
		super();
		this.street = street;
		this.zipcode = zipcode;
		this.city = city;
		this.state = state;
		this.country = country;
		this.aptNo = aptNo;
	}
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public long getZipcode() {
		return zipcode;
	}
	public void setZipcode(long zipcode) {
		this.zipcode = zipcode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAptNo() {
		return aptNo;
	}
	public void setAptNo(String aptNo) {
		this.aptNo = aptNo;
	}

}

import java.time.LocalDate;
import java.util.*;
import java.time.LocalDateTime;  

public class Patient extends Person
{

	private int patientID;
	private Guardian guardian;
	private List<Allergy> listOfAllergies;
	private BloodGroup bloodGroup;
	//MedicalHistory object
	private float height;
	private float weight;
	private Map<LocalDateTime,Temperature> temperatureReading;

	public Patient(String name, Address address, LocalDate dateOfBirth, String phoneNumber, Gender gender,
			int patientID, Guardian guardian, List<Allergy> listOfAllergies, BloodGroup bloodGroup, float height,
			float weight) 
	{
		super(name, address, dateOfBirth, phoneNumber, gender);
		this.patientID = patientID;
		this.guardian = guardian;
		this.listOfAllergies = listOfAllergies;
		this.bloodGroup = bloodGroup;
		this.height = height;
		this.weight = weight;
	}

	public void addTempReading(Temperature temperature)
	{
		temperatureReading.put(LocalDateTime.now(), temperature);
	}
	public int getPatientID() 
	{
		return patientID;
	}

	public Guardian getGuardian() 
	{
		return guardian;
	}

	public void setGuardian(Guardian guardian) {
		this.guardian = guardian;
	}

	public List<Allergy> getListOfAllergies() {
		return listOfAllergies;
	}

	public void addAllergy(Allergy allergy) {
		listOfAllergies.add(allergy);
	}

	public BloodGroup getBloodGroup() {
		return bloodGroup;
	}


	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
		

}

import java.util.List;



public abstract class Allergy 
{
	private String Description;
	private List<String> symptoms;
	private List<String> treatments;
	private Severity severity;
	
	
	public Allergy(String description, List<String> symptoms, List<String> treatments,String severity) 
	{
		super();
		Description = description;
		this.symptoms = symptoms;
		this.treatments = treatments;
		this.severity=Severity.valueOf(severity);
	}

	public Severity getSeverity() {
		return severity;
	}



	public String getDescription() 
	{
		return Description;
	}
		
	public List<String> getSymptoms() 
	{
		return symptoms;
	}
	
	public void addSymptoms(String symptom) 
	{
		symptoms.add(symptom);
	}
	
	public List<String> getTreatments() 
	{
		return treatments;
	}
	
	public void addTreatments(String treatment) 
	{
		treatments.add(treatment);
	}

}

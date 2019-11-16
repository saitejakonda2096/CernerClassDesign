import java.util.List;

public class PetAllergy extends Allergy
{

	List<Pet> listOfPetsAllergicTo;
	
	public PetAllergy(String description, List<String> symptoms, List<String> treatments,String severity,List<Pet> listOfPetsAllergicTo) 
	{
		super(description, symptoms, treatments,severity);
		// TODO Auto-generated constructor stub
		this.listOfPetsAllergicTo=listOfPetsAllergicTo;
	}
	
	public void addPet(String pet)
	{
		listOfPetsAllergicTo.add(Pet.valueOf(pet));
	}
	
}

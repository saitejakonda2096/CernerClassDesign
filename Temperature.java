
public class Temperature
{
	private double temperature;
	private TempUnit unit;
	private BodyPart part;
	

	Temperature(double temperature,String unit, String bodyPart)
	{
		this.temperature=temperature;
		this.unit=TempUnit.valueOf(unit);
		this.part=BodyPart.valueOf(bodyPart);		
	}

	public double getTemperature() {
		return temperature;
	}


	public TempUnit getUnit() {
		return unit;
	}


	public BodyPart getPart() {
		return part;
	}


	public double getTempInCel()
	{
		if(unit==TempUnit.CELSIUS)return temperature;
		else
		{
			//calculate temperature in celcius
			//return temp in celcius
			return temperature;
		}
	}

	public double getTempInFahrenhiet()
	{
		if(unit==TempUnit.FAHRENHIET)return temperature;
		else
		{
			//calculate temperature in fahrenhiet
			//return temp in fahrenhiet
			return temperature;
		}
	}

}
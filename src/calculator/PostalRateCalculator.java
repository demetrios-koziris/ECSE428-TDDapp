package calculator;

public class PostalRateCalculator {

	public float length, width, thickness, weight;
	public Destination dest;
	public Type type;
	public Payment payment;

	public enum Destination {
		CANADA, USA, INTERNATIONAL
	}
	public enum Type {
		LETTER, OTHER
	}
	public enum Payment {
		SINGLE_STAMP, BOOKLET_STAMP, METER_POSTAL_INDICIA
	}

	public Type determineType() {
		if (length >= 140 && length < 245 &&
		    width >= 90 && width < 156 &&
		    thickness >= 0.18 && thickness < 5 &&
		    weight >= 2 && weight < 50) 
		{
			type = Type.LETTER;
		}
		else if (length <= 380 &&
		         width <= 270 &&
		         thickness <= 20 &&
		         weight <= 500)
		{
			type = Type.OTHER;
		}
		return type;
	}

	public float getPostalRate() {
		return 0.0f;
	}

}

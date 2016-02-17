package calculator;

public class PostalRateCalculator {

	public float length, width, thickness, weight;
	public Destination dest;
	public Type type;
	public Item item;

	public enum Destination {
		CANADA, USA, INTERNATIONAL
	}
	public enum Type {
		LETTER, OTHER
	}
	public enum Item {
		SINGLE_STAMP, BOOKLET_STAMP, METER_POSTAL_INDICIA
	}

	public Type determineType() {
		return type;
	}

	public float getPostalRate() {
		return 0.0f;
	}

}

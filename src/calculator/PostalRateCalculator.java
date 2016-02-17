
package calculator;

public class PostalRateCalculator {
	public float length, width, height, weight;
	public enum Type {
		LETTER, OTHER
	}
	public enum Destination {
		CANADA, USA, INTERNATIONAL
	}
	public Destination dest;
	public Type type;
	public enum Item {
		SINGLE_STAMP, BOOKLET_STAMP, METER_POSTAL_INDICIA
	}
	public Item item;

	public static float getPostalRate();

	public static Type getType() return type;

	public static Destination getDest() return dest;

	public static Item getItem() return item;



}

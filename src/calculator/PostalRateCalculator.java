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
		STAMP_BOOKLET, STAMP_SINGLE, METER_POSTAL_INDICIA
	}

	public Type determineType() {
		if (length >= 140 && length <= 245 &&
		    width >= 90 && width <= 156 &&
		    thickness >= 0.18 && thickness <= 5 &&
		    weight >= 2 && weight <= 50) 
		{
			type = Type.LETTER;
		}
		else if (length <= 380 &&
		         width <= 270 &&
		         thickness <= 20 &&
		         weight >= 3 && weight <= 500)
		{
			type = Type.OTHER;
		}
		return type;
	}

	public float getPostalRate() {

		type = determineType();
		if (type == null) {
			throw new IllegalArgumentException("ERROR: Selected length, width, thickness, and weight parameters do not match LETTER or OTHER");
		}

		if (dest == null || payment == null) {
			throw new IllegalArgumentException("ERROR: Must provide values for destination ant payment-method");
		}

		if (dest == Destination.CANADA) {
			if (type == Type.LETTER) {
				if (weight <= 30) {
					if (payment == Payment.STAMP_BOOKLET) {
						return 0.85f;
					}
					else if (payment == Payment.METER_POSTAL_INDICIA) {
						return 0.80f;
					}
					else if (payment == Payment.STAMP_SINGLE) {
						return 1.00f;
					}
				}
				else if (weight <= 50) {
					if (payment == Payment.STAMP_BOOKLET) {
						return 1.20f;
					}
					else if (payment == Payment.METER_POSTAL_INDICIA) {
						return 1.19f;
					}
					else if (payment == Payment.STAMP_SINGLE) {
						return 1.20f;
					}
				}
			}
			else if (type == Type.OTHER) {
				if (weight <= 100) {
					if (payment == Payment.STAMP_BOOKLET || payment == Payment.STAMP_SINGLE) {
						return 1.80f;
					}
					else if (payment == Payment.METER_POSTAL_INDICIA) {
						return 1.71f;
					}
				}
				else if (weight <= 200) {
					if (payment == Payment.STAMP_BOOKLET || payment == Payment.STAMP_SINGLE) {
						return 2.95f;
					}
					else if (payment == Payment.METER_POSTAL_INDICIA) {
						return 2.77f;
					}
				}
				else if (weight <= 300) {
					if (payment == Payment.STAMP_BOOKLET || payment == Payment.STAMP_SINGLE) {
						return 4.10f;
					}
					else if (payment == Payment.METER_POSTAL_INDICIA) {
						return 3.89f;
					}
				}
				else if (weight <= 400) {
					if (payment == Payment.STAMP_BOOKLET || payment == Payment.STAMP_SINGLE) {
						return 4.70f;
					}
					else if (payment == Payment.METER_POSTAL_INDICIA) {
						return 4.42f;
					}
				}
				else if (weight <= 500) {
					if (payment == Payment.STAMP_BOOKLET || payment == Payment.STAMP_SINGLE) {
						return 5.05f;
					}
					else if (payment == Payment.METER_POSTAL_INDICIA) {
						return 4.74f;
					}
				}
			}
		}
		else if (dest == Destination.USA) {
			if (type == Type.LETTER) {
				if (weight <= 30) {
					if (payment == Payment.STAMP_BOOKLET || payment == Payment.STAMP_SINGLE) {
						return 1.20f;
					}
					else if (payment == Payment.METER_POSTAL_INDICIA) {
						return 1.19f;
					}
				}
				else if (weight <= 50) {
					if (payment == Payment.STAMP_BOOKLET || payment == Payment.STAMP_SINGLE) {
						return 1.80f;
					}
					else if (payment == Payment.METER_POSTAL_INDICIA) {
						return 1.72f;
					}
				}
			}
			else if (type == Type.OTHER) {
				if (weight <= 100) {
					if (payment == Payment.STAMP_BOOKLET || payment == Payment.STAMP_SINGLE) {
						return 2.95f;
					}
					else if (payment == Payment.METER_POSTAL_INDICIA) {
						return 2.68f;
					}
				}
				else if (weight <= 200) {
					if (payment == Payment.STAMP_BOOKLET || payment == Payment.STAMP_SINGLE) {
						return 5.15f;
					}
					else if (payment == Payment.METER_POSTAL_INDICIA) {
						return 4.85f;
					}
				}
				else if (weight <= 500) {
					if (payment == Payment.STAMP_BOOKLET || payment == Payment.STAMP_SINGLE) {
						return 10.30f;
					}
					else if (payment == Payment.METER_POSTAL_INDICIA) {
						return 9.69f;
					}
				}
			}
		}
		else if (dest == Destination.INTERNATIONAL) {
			if (type == Type.LETTER) {
				if (weight <= 30) {
					if (payment == Payment.STAMP_BOOKLET || payment == Payment.STAMP_SINGLE) {
						return 2.50f;
					}
					else if (payment == Payment.METER_POSTAL_INDICIA) {
						return 2.36f;
					}
				}
				else if (weight <= 50) {
					if (payment == Payment.STAMP_BOOKLET || payment == Payment.STAMP_SINGLE) {
						return 3.60f;
					}
					else if (payment == Payment.METER_POSTAL_INDICIA) {
						return 3.42f;
					}
				}
			}
			else if (type == Type.OTHER) {
				if (weight <= 100) {
					if (payment == Payment.STAMP_BOOKLET || payment == Payment.STAMP_SINGLE) {
						return 5.90f;
					}
					else if (payment == Payment.METER_POSTAL_INDICIA) {
						return 5.56f;
					}
				}
				else if (weight <= 200) {
					if (payment == Payment.STAMP_BOOKLET || payment == Payment.STAMP_SINGLE) {
						return 10.30f;
					}
					else if (payment == Payment.METER_POSTAL_INDICIA) {
						return 9.69f;
					}
				}
				else if (weight <= 500) {
					if (payment == Payment.STAMP_BOOKLET || payment == Payment.STAMP_SINGLE) {
						return 20.60f;
					}
					else if (payment == Payment.METER_POSTAL_INDICIA) {
						return 19.39f;
					}
				}
			}
		}
		return 0.0f;
	}

}

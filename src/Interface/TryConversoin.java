package Interface;

public class TryConversoin implements Conversion {

	public double kgToGram(double kg) {
		return kg * KG_TO_GRAM;
	}
	public double inchesToMm(double inches) {
		return inches* INCHES_TO_MM;
	}
}

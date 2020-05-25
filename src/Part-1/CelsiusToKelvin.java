
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;

/*
 * This basic java example source code
 * reads temperature in degrees Celsius from console input
 * Java Program to convert Degree Celsius to Kelvin
 */

public class CelsiusToKelvin {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Logger logger = Logger.getLogger(CelsiusToKelvin.class.getName());
		// Declare the reader from console
		BufferedReader br;
		// Get the console input for the temperature in degree Celsius
		logger.info("Temperature in Degree Celsius:");
		br = new BufferedReader(new InputStreamReader(System.in));
		// assign to float variable the degree celsius
		float celsius = Float.parseFloat(br.readLine());
		// Degrees Celsius to Kelvin Conversion
		float kelvin = celsius + 273.15F;
		logger.info("Kelvin: " + kelvin);

	}

}
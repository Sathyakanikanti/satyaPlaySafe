
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;

/*
 * This basic java example source code
 * reads temperature in Kelvin from console input
 * Java Program to convert Kelvin to Degree Celsius
 */

public class KelvinToCelsius {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// Declare the reader from console
		Logger logger = Logger.getLogger(KelvinToCelsius.class.getName());
		BufferedReader br;
		// Get the console input for the temperature in Kelvin
		logger.info("Temperature in Kelvin:");
		br = new BufferedReader(new InputStreamReader(System.in));
		// assign to float variable the temperature in Kelvin
		float kelvin = Float.parseFloat(br.readLine());
		// Kelvin to Degree Celsius Conversion
		float celsius = kelvin - 273.15F;
		logger.info("Celsius: " + celsius);

	}

}

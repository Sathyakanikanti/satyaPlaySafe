
import java.util.Scanner;

import java.util.logging.Logger;

public class MilesToKilometers {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(MilesToKilometers.class.getName());
		double miles;

		Scanner in = new Scanner(System.in);
		logger.info("Please enter miles:");
		miles = in.nextDouble();

		double kilometers = miles * 1.6;
		logger.info(kilometers + " Kilometers");

	}
}
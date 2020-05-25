
import java.util.Scanner;

import java.util.logging.*; 

public class KilometersToMiles {

	public static void main(String[] args) {
		Logger logger 
        = Logger.getLogger(KilometersToMiles.class.getName()); 
		double kilometers;
		logger.info("Please enter kilometers:");
		Scanner in = new Scanner(System.in);
		kilometers = in.nextDouble();
		double miles = kilometers / 1.6;
		logger.info(miles + " Miles");
	}
}

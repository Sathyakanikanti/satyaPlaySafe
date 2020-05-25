import java.util.Random;
import java.util.Scanner;

public class RouletteGame 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		Random generator = new Random();
		String name = null;
		double amount = 0.0;
		int choice = -1;
		int number = 0;
		int rouletteNum;
		int result;
		char response = 'y';
		rouletteNum = generator.nextInt(37);
		if (response == 'y' || response == 'Y')
		{
			System.out.println("Enter your input:");
			String input = keyboard.nextLine();
			if(input != null && !input.isEmpty()) {
				String[] inputs = input.split("\\s+");
				name = inputs[0];
				String bet = inputs[1];
				amount = Double.valueOf(inputs[2]);
				if(bet.equalsIgnoreCase(Type.EVEN.name())) {
					choice = Type.EVEN.value;
				}else if(bet.equalsIgnoreCase(Type.ODD.name())) {
						choice = Type.ODD.value;
					}
					else {
						choice = Type.Number.value;
						number = Integer.valueOf(bet);
						
						
					}
					
				}
				
				if(choice == 2) {
					if(rouletteNum == number)
						result = 35;
					else
						result = 1;
				}
				else {
					if(rouletteNum == 0 || rouletteNum % 2 != choice)
					result = 0;
					else
						result = 1;
				}
				
				System.out.println("Number "+rouletteNum);   
				System.out.println("Player             Bet     Outcome    Winnins");
				System.out.println("---"); 
				//print out game result, Win/Lose amount
				
				if(result > 0) {
					System.out.println(new StringBuilder().append(name).append("              ").append(result * amount).append("   ").append("   WIN  ").append((result + 1) * amount).toString());		
				}
				else {
					System.out.println(new StringBuilder().append(name).append("                  ").append(amount).append("   ").append("LOST   ").append("0.0").toString());	
			       }
	
			}
		
	}	
	
	public enum Type{
		EVEN(0), ODD(1), Number(2);
		
		private int value;

		Type(int value){
			this.value = value;
		}
		
		public int getValue() {
			return value;
			
		}
		
	}
}


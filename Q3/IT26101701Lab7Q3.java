import java.util.Scanner;

public class IT26101701Lab7Q3 {
	
    public static void main(String[] args) {
		
		//Declaring and Initializing the Constants
		final double DISCOUNT_RATE = 0.05; // 5% discount rate
		final int NUMBER_OF_CUSTOMERS = 5; // Number of customers
		
		//Declaring and Initializing the variables
		double billAmount, amountToPay;
		char paymentMode;
		
		double discount = 0;
		
		//Creating the Scanner object for input
		Scanner input = new Scanner(System.in);
		
		//Getting user inputs
		for (int customerCount = 1; customerCount <= NUMBER_OF_CUSTOMERS; customerCount++) {
			System.out.println("Customer" + customerCount);
			
			System.out.print("Enter total bill amount: ");
			billAmount = input.nextDouble();
			
			//Input the mode of payment 
			System.out.print("Enter mode of payment (C for cash, O for others): ");
			paymentMode = input.next().toUpperCase().charAt(0);   //character index 0 = character at first position
			
			//Check the mode of payment and calculate discount 
			if (paymentMode == 'C' ) {
				
				//Apply discount
				discount = billAmount * DISCOUNT_RATE;
				amountToPay = billAmount - discount;
				
				System.out.println("Discount is: " + discount);
				System.out.println("Amount to be paid: " + amountToPay);
			}
			else if (paymentMode == 'O' ) {
				
				//No discount
				amountToPay = billAmount;
				
				System.out.println("No discount applicable");
				System.out.println("Amount to be paid: " + amountToPay);
			}
			else {
				
				//Invalid payment mode
				System.out.println("Payment Mode is Not Valid");
				System.out.println();
				
				continue;  // Skip to the next customer 				}
		}
		
		System.out.println(); // Print a blank line for better readability
		
    }
}

}

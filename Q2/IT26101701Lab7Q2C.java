import java.util.Scanner;

public class IT26101701Lab7Q2C {
	
    public static void main(String[] args) {
		
		int row, column;
		
		//Nested for loop to loop from numbers 5 to 1
		for (row = 5; row >= 1; row-- ) {   //Outer for loop used to control the rows
			
			//Loop to print the row number in descending order according to the column number
			for (column = 1; column <= row; column++ ) {   //Inner for loop used to control the columns
				
				System.out.print(row);
				
			}
			
			System.out.println();
			
		}
	
	}
	
}
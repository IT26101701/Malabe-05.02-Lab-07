import java.util.Scanner;

public class IT26101701Lab7Q2B {
	
    public static void main(String[] args) {
	
		int rowCount, columnCount;
		
		//Loop through numbers 1 to 5
		for (rowCount = 1; rowCount <= 5; rowCount++ ) {   //Outer for loop used to control the rows
			
			//Print the current number
			System.out.print(rowCount + " - ");
			
			//Loop to print stars  for the current number
			for (columnCount = 0; columnCount < rowCount; columnCount++ ){   //Inner for loop used to control the columns
				
				System.out.print("* ");
				
			}
			
			System.out.println();
			
		}
	
	}
	
}
import java.util.Scanner;

public class IT26101701Lab7Q1B {
	
    public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Variable declaration
        int student, mark1, mark2, mark3, mark4;
        double average;
		String grade;
		
		//Fetching user inputs for marks of 4 different subjects of 3 students
		for (student = 1; student <= 3; student++) {
			
            System.out.println("Student " + student);
            System.out.print("Enter marks: ");
			
            mark1 = input.nextInt();
            mark2 = input.nextInt();
            mark3 = input.nextInt();
            mark4 = input.nextInt();

			//Calculate average
			average = (mark1 + mark2 + mark3 + mark4) / 4.0;

            //Display grade
            if (average >= 75) {
                grade = "Distinction";
            } else if (average >= 50) {
                grade = "Credit";
            } else {
                grade = "Fail";
            }

            System.out.println("Average is : " + average);
            System.out.println("Overall Grade is : " + grade);
            System.out.println();
        }
		
	}
}
package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int choose = 1;
		
		do {
			System.out.println("***THE BEST CALCULATOR YOU EVER SEEN***");
			System.out.println("");
			System.out.println("Choose the option below that you want to perform the calculation for:");
			System.out.println("");
			System.out.println("1) Addition");
			System.out.println("2) Subtration");
			System.out.println("3) Multiplication");
			System.out.println("4) Division");
			System.out.println("5) Square Root");
			System.out.println("6) Exponent");
			System.out.println("7) Percentage");
			System.out.println("");
			System.out.println("Choice:");
			
			int option = sc.nextInt();
			
			String optionString = String.valueOf(Math.abs(option));
			int optionfirstNumber = Character.getNumericValue(optionString.charAt(0));
			System.out.println("");
			
			switch (optionfirstNumber) {
				case 1:
					System.out.print("Enter the first number: ");
					double firstNumber = sc.nextDouble();
					System.out.print("Enter the second number: ");
					double secondNumber = sc.nextDouble();
					sc.nextLine();
					System.out.println("Result: " + (firstNumber + secondNumber));
					System.out.println("");					
					break;
					
				case 2:
					System.out.print("Enter the first number: ");
					firstNumber = sc.nextDouble();
					System.out.print("Enter the second number: ");
					secondNumber = sc.nextDouble();
					sc.nextLine();
					System.out.println("Result: " + (firstNumber - secondNumber));
					System.out.println("");
					
					break;
					
				case 3:
					System.out.print("Enter the first number: ");
					firstNumber = sc.nextDouble();
					System.out.print("Multiplied by: ");
					secondNumber = sc.nextDouble();
					sc.nextLine();
					System.out.println("Result: " + (firstNumber * secondNumber));
					System.out.println("");
					break;
					
				case 4: 
					System.out.print("Enter the first number: ");
					firstNumber = sc.nextDouble();
					System.out.print("Divided by: ");
					secondNumber = sc.nextDouble();
					sc.nextLine();
					System.out.println("Result: " + (firstNumber * secondNumber));
					System.out.println("");
					break;
					
				case 5: 
					System.out.print("Enter the number you want the square root: ");
					firstNumber = sc.nextDouble();
					
					sc.nextLine();
					System.out.println("Result: " + Math.sqrt(firstNumber));
					System.out.println("");
					break;
					
				case 6: 
					System.out.print("Enter the base number: ");
					firstNumber = sc.nextDouble();
					System.out.print("Enter the exponent: ");
					secondNumber = sc.nextDouble();
					sc.nextLine();
					System.out.println("Result: " + Math.pow(firstNumber, secondNumber));
					System.out.println("");
					break;
					
				case 7:
					System.out.print("Enter the base number: ");
					firstNumber = sc.nextDouble();
					System.out.print("Enter the percentage: ");
					secondNumber = sc.nextDouble();
					sc.nextLine();
					System.out.println("Result: " + (firstNumber * secondNumber / 100));
					System.out.println("");
					break;
					
				}
			System.out.print("Do you want to do more calculations? 1 for Yes or 0 for No?");
			choose = sc.nextInt();
		}
			
		while (choose == 1);
		System.out.println("");
		System.out.println("Thank you for using my calculator!");
		sc.close();
	}

}



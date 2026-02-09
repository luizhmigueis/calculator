package entities;

public class Calculations {
		
	public static Double addition (double firstNumber, double secondNumber) {
		return firstNumber + secondNumber;
		
	}
	public static Double subtration (double firstNumber, double secondNumber) {
		return firstNumber - secondNumber;
		
	}
	public static Double multiplication (double firstNumber, double secondNumber) {
		return firstNumber * secondNumber;
		
	}
	public static Double division (double firstNumber, double secondNumber) {
		return firstNumber / secondNumber;
		
	}
	public static Double squareRoot (double firstNumber) {
		return Math.sqrt(firstNumber);
		
	}
	public static Double exponent (double firstNumber, double secondNumber) {
		return Math.pow(firstNumber, secondNumber);
		
	}
	public static Double percentage (double firstNumber, double secondNumber) {
		return firstNumber * secondNumber / 100;
		
	}

}

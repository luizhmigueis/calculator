package entities;

public class Calculations {
	private Double firstNumber;
	private Double secondNumber;
		
	public Calculations () {
		
	}
		
	public Calculations(Double firstNumber, Double secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}

	public Double addition (double firstNumber, double secondNumber) {
		return firstNumber + secondNumber;
		
	}
	public Double subtration (double firstNumber, double secondNumber) {
		return firstNumber - secondNumber;
		
	}
	public Double multiplication (double firstNumber, double secondNumber) {
		return firstNumber * secondNumber;
		
	}
	public Double division (double firstNumber, double secondNumber) {
		return firstNumber / secondNumber;
		
	}
	public Double squareRoot (double firstNumber) {
		return Math.sqrt(firstNumber);
		
	}
	public Double exponent (double firstNumber, double secondNumber) {
		return Math.pow(firstNumber, secondNumber);
		
	}
	public Double percentage (double firstNumber, double secondNumber) {
		return firstNumber * secondNumber / 100;
		
	}

}

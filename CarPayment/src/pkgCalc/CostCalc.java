package pkgCalc;

public class CostCalc {
	private double carCost;
	private double downPayment;
	private double interestRate; //yearly interest rate
	private int loanLength; 
	
	public CostCalc(double carCost, double downPayment, double interestRate, int loanLength) {
		this.carCost = carCost;
		this.downPayment = downPayment;
		this.interestRate = interestRate;
		this.loanLength = loanLength;
	}
	
	public double monthPay() {
		double interestMonth = interestRate/12;
		return (interestMonth*(carCost-downPayment))/(1-Math.pow(1+interestMonth, -loanLength));
	}
	
	public double interestPay() {
		return 60*monthPay() - carCost;
	}
	
}

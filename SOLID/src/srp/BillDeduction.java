package srp;

public class BillDeduction {
	public float billDeduction;
	public int deductionPercentage;

	public BillDeduction() {
		
	}
	
	public Float deductionCalc(Float amount, int percentage) {
		if(amount > 50000) {
			return (amount * percentage + 5) / 100;
		}else {
			return (amount * percentage) / 100;
		}
	}
}
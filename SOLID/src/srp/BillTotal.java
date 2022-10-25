package srp;

public class BillTotal {
	public float billAmount;

	public BillTotal() {
	}
	
	//Hirugarren puntua: laugarren parametro bat gehituko zaio, kodea
	//eta if-else baten bidez kontrolatuko da VAT-a gehitu edo ez.
	public Float totalCalc(float amount, float VAT, float deduction, String kodea) {
		if(kodea.equals("0")) {
			return (amount - deduction);
		}else {
			return (amount - deduction) + VAT;
		}
	}
}
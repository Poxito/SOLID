package srp;

import java.util.Date;

public class Bill {

	public String code;
	public Date billDate;
	public float billAmount;
	public float VAT;
	public float billDeduction;
	public float billTotal;
	public int deductionPercentage;
	public BillDeduction deductor = new BillDeduction();
	public BillVAT vatCalculator = new BillVAT((float) 0.16); 
	//%18 aldatu nahi bada erakitzaileko parametroa aldatu beharko litzateke
	public BillTotal totalCalculator = new BillTotal();
	
	// Fakturaren totala kalkulatzen duen metodoa.
	public void totalCalc() {
		// Dedukzioa kalkulatu
		billDeduction = deductor.deductionCalc(billAmount, deductionPercentage);
		// VAT kalkulatzen dugu
		VAT = vatCalculator.vatCalc(billAmount);
		// Totala kalkulatzen dugu
		billTotal = totalCalculator.totalCalc(billAmount, VAT, billDeduction, code);
	}
}

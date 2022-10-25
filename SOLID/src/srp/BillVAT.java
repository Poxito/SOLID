package srp;

public class BillVAT {

	public float VATPercentage;
	
	public BillVAT(float percentage) {
		this.VATPercentage = percentage;
	}
	
	public Float vatCalc(float amount) {
		return (amount * VATPercentage);
	}
}

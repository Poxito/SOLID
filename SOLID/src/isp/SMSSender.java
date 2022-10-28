package isp;

public class SMSSender {

	public SMSSender() {
		
	}
	
	public static void sendSMS(ITelephone c, String message){
		//SMS bat bidaltzen du Person klaseko telefono zenbakira.
		System.out.println("Telefono zenbakia: " + c.getTelephone() + ". Mezua: "+ message);
	}
	
}

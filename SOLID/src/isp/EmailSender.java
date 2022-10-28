package isp;

public class EmailSender {
	
	public EmailSender() {
		
	}

	public static void sendEmail(IEmail c, String message){
		// Mezu bat bidaltzen du Person klaseko korreo helbidera.
		System.out.println("Emaila: " + c.getEmail() + ". Mezua: "+ message);
	}
	
}

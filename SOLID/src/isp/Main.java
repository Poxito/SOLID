package isp;

public class Main {

	public static void main(String[] args) {

		GmailAccount ga = new GmailAccount("Gorka", "gorka@gmail.com");
		EmailSender es = new EmailSender();
		
		es.sendEmail(ga, "Mezu hau Gmail kontu batetik bidali da.");
	}

}

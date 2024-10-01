package Testngproject1.iTCbackoffice1;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;
public class emailSent {

	public static void main(String[] args) throws EmailException {
		// TODO Auto-generated method stub
		
	/*	System.out.println("===Test Start===");
		Email email = new SimpleEmail();
		email.setHostName("mail.coanetwork.com");
		email.setSmtpPort(587);
		email.setAuthenticator(new DefaultAuthenticator("singanaboina.suresh@coanetwork.com", "Sa@45sh**!"));
		email.setSSLOnConnect(true);
		email.setFrom("singanaboina.suresh@coanetwork.com");
		email.setSubject("TestMail");
		email.setMsg("This is a test mail ... :-)");
		email.addTo("bharath.chandra@coanetwork.com");
		email.send();
		System.out.println("===Test End===");
	*/
System.out.println("===Start Test");
	  EmailAttachment attachment = new EmailAttachment();
	  attachment.setPath("C:\\Spring\\eclipse-workspace\\iTCbackoffice1\\test-output\\emailable-report.html");
	  attachment.setDisposition(EmailAttachment.ATTACHMENT);
	  attachment.setDescription("Test results");
	  attachment.setName("Test results");

	  // Create the email message
	  MultiPartEmail email = new MultiPartEmail();
	  email.setHostName("mail.coanetwork.com");
	  email.addTo("bharath.chandra@coanetwork.com", "John Doe");
	  email.setFrom("singanaboina.suresh@coanetwork.com", "Me");
	  email.setSubject("The picture");
	  email.setMsg("Here is the picture you wanted");

	  // add the attachment
	  email.attach(attachment);

	  // send the email
	  email.send();
	  System.out.println("===End Test");
	}
}
	


package Testngproject1.iTCbackoffice1;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class EmailUtils {

	    private final String host;
	    private final String port;
	    private final String username;
	    private final String password;

	    public EmailUtils(String host, String port, String username, String password) {
	        this.host = host;
	        this.port = port;
	        this.username = username;
	        this.password = password;
	    }

	    public void sendUsingSMTP(String recipient, String subject, String body) throws MessagingException {
	        Properties props = new Properties();
	        props.put("mail.smtp.auth", "true");
	        props.put("mail.smtp.starttls.enable", "true");
	        props.put("mail.smtp.host", host);
	        props.put("mail.smtp.port", port);

	        Session session = Session.getInstance(props, new Authenticator() {
	            protected PasswordAuthentication getPasswordAuthentication() {
	                return new PasswordAuthentication(username, password);
	            }
	        });

	        try {
	            Message message = new MimeMessage(session);
	            message.setFrom(new InternetAddress(username));
	            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
	            message.setSubject(subject);
	            message.setText(body);

	            Transport.send(message);
	            System.out.println("Email sent successfully to " + recipient);
	        } catch (MessagingException e) {
	            throw new MessagingException("Failed to send email to " + recipient, e);
	        }
	    }
	}




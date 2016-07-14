package application;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class email_send {
	
	private String user = "jstmailsend@gmail.com";
	private String password = "testmail";
	
	public void send( String destinatar){
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "25");
		
		Session session = Session.getInstance(props, new javax.mail.Authenticator(){
			protected PasswordAuthentication getPasswordAuthentication(){
				return new PasswordAuthentication(user, password);
			}
		});
		
		try{
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(user));
			message.setRecipients(Message.RecipientType.TO, 
					InternetAddress.parse(destinatar));
			message.setSubject("Test");
			message.setText("Va prezentam noile oferte!");
				Transport.send(message);
		} catch (Exception e){
			
		}
	}
}

package com;

import java.io.IOException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ValidateEmailServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse response)
			throws IOException, ServletException {

        String name = req.getParameter("name");
        String message = req.getParameter("message");

        Properties props = new Properties();
        Session session = Session.getDefaultInstance(props, null);
        
        if( name.isEmpty() || message.isEmpty())
        {  
			response.sendRedirect("/contact.jsp?error=0");
        }
        else
        {
	        try {
	        	String ipAddress  = req.getHeader("X-FORWARDED-FOR");  
	            if(ipAddress == null)  
	            {  
	              ipAddress = req.getRemoteAddr();  
	            }  
	            //System.out.println("ipAddress:"+ipAddress); 
	            
	            Message msg = new MimeMessage(session);
	            msg.setFrom(new InternetAddress("pete.hamalainen@gmail.com", "Petteri Hamalainen"));
	            msg.addRecipient(Message.RecipientType.TO, new InternetAddress("petteri_hamalainen@yahoo.com", ""));
	            msg.setSubject("Contact request from website");
	            msg.setText(message + "\n\nName: " + name + "\nIP: " + ipAddress);
	            Transport.send(msg);
	
	        } catch (AddressException e) {
	            // ...
	        } catch (MessagingException e) {
	            // ...
	        }
	
	 		response.sendRedirect("/contact.jsp?error=1");
        }
	}
}
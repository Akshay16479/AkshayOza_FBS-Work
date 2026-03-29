package com.blood.controller;

import java.util.Properties;

import jakarta.mail.*;
import jakarta.mail.internet.*;

public class EmailUtil {

    public static void sendEmail(String toEmail, String subject, String messageText) {

    	  final String from = "akshay.oza16479@sakec.ac.in";
          final String password = "wlksmiqhusrgaomj";

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        Session session = Session.getInstance(props,
            new Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(from, password);
                }
            });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));

            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(toEmail));

            message.setSubject(subject);
            message.setText(messageText);

            Transport.send(message);

            System.out.println("MAIL SENT SUCCESS ✅");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import control.MediaControl;
import control.SerialConnection;
import java.util.Properties;
import java.util.Vector;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author Win -8
 */
public class ClassicMedia {

    static char c = '"';
    static char ctrtZ = (char) 26;
    public static String port;
    static SerialConnection serialcons;

    public static void sendEmail(String emailAddress, String emailPassword, String receiverAddress, String subject, String body) {
        final String username = emailAddress;
        final String password = emailPassword;
        final String receiver = receiverAddress;

        Properties props = new Properties();
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(receiver));
            message.setSubject(subject);
            message.setText(body);

            Transport.send(message);

            System.out.println("Done");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

    public static void sendSms(final String toNumber, final String text) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    port = "COM4";
                    serialcons = MediaControl.setPort(port);
                    System.out.println("Sending Started....");
                    serialcons.send("AT+CMGF=1");
                    serialcons.send("AT");
                    try {
                        Thread.sleep(5000);
                    } catch (Exception e) {
                    }
                    String s1 = serialcons.getIncommingString();
                    System.out.println("s1  " + s1);
                    if (s1.contains("OK")) {
                        serialcons.send("AT+CMGS=" + c + "" + toNumber + c);
                        try {
                            Thread.sleep(5000);
                        } catch (Exception e) {
                        }
                        String s2 = serialcons.getIncommingString();
                        System.out.println("s2" + s2);
                        if (s2.contains(">")) {
                            serialcons.send(text + ctrtZ);
                            try {
                                Thread.sleep(5000);
                            } catch (Exception e) {
                            }
                            System.out.println(serialcons.getIncommingString());
                        } else {
                            System.out.println("Error mode 03");
                        }
                    } else {
                        System.out.println("Error mode 01");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Connection Error !", "Connection Settings", JOptionPane.ERROR);
                }
            }
        }).start();
    }

    public void receiveSms() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                
                port = "COM4";
                serialcons = MediaControl.setPort(port);
                System.out.println("Sending Started....");
                
            }
        }).start();
    }
}

package hola;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import java.util.Random;

public class hola {
    public static void main(String[] args) {
        // Configuración del servidor de correo
        String host = "smtp.live.com";
        int port = 587;
        String username = "LGZConcessionaire@hotmail.com";
        String password = "RobinsonMiAmor1";

        // Propiedades de la conexión
        Properties props = new Properties();
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", port);
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        // Crear sesión de correo electrónico
        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });
        try {
            // Crear el mensaje de correo electrónico
            Message message = crearMensaje(session, username, "londgav01@gmail.com");

            // Enviar el mensaje
            Transport.send(message);

            System.out.println("Correo enviado exitosamente.");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    // Crear el mensaje de correo electrónico
    private static Message crearMensaje(Session session, String remitente, String destinatario) throws MessagingException {
        // Crear el mensaje de correo electrónico
        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(remitente));
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(destinatario));
        message.setSubject("Código de verificación");

        // Generar un código aleatorio de 5 letras
        String codigo = generarCodigoAleatorio(5);

        // Cuerpo del correo con una imagen en línea y el código de verificación
        String htmlBody = "<h1>Código de verificación</h1>";
        htmlBody += "<p>Aquí está su código de verificación:</p>";
        htmlBody += "<h2>" + codigo + "</h2>";
        //htmlBody += "<img src='https://drive.google.com/file/d/1i74IK4BKane5ZJ6teYA63J9U7Mjt3r53/view?usp=sharing'>";
        message.setContent(htmlBody, "text/html");

        return message;
    }

    // Generar un código aleatorio de letras
    private static String generarCodigoAleatorio(int longitud) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder codigo = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < longitud; i++) {
            int index = random.nextInt(caracteres.length());
            codigo.append(caracteres.charAt(index));
        }

        return codigo.toString();
    }
}

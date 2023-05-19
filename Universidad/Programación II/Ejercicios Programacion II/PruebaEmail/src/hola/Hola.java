package hola;

import java.net.PasswordAuthentication;
import javax.mail.*;
import java.util.Properties;
import java.util.Random;

public class Hola {

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
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("destinatario@example.com"));
            message.setSubject("Código de verificación");

            // Generar un código aleatorio de 5 letras
            String codigo = generarCodigoAleatorio(5);

            // Cuerpo del correo con una imagen en línea y el código de verificación
            String htmlBody = "<h1>Código de verificación</h1>";
            htmlBody += "<p>Aquí está su código de verificación:</p>";
            htmlBody += "<h2>" + codigo + "</h2>";
            htmlBody += "<img src='https://example.com/imagen.jpg' alt='Imagen'>";
            message.setContent(htmlBody, "text/html");

            // Enviar el mensaje
            Transport.send(message);

            System.out.println("Correo enviado exitosamente.");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
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

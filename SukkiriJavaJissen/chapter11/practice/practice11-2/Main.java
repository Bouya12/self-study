import java.io.*;
import java.net.*;

public class Main {
  public static void main(String[] args) {
    try (Socket sock = new Socket("smtp.example.com", 60025);) {
      InputStream is = sock.getInputStream();
      OutputStream os = sock.getOutputStream();
      os.write("HELO example.com\r\n".getBytes());
      os.write("MAIL FROM: asaka@example.com\r\n".getBytes());
      os.write("RCPT TO: minato@example.com\r\n".getBytes());
      os.write("DATA\r\n".getBytes());
      os.write("From: asaka@example.com\r\n".getBytes());
      os.write("Subject: Please send me your RPG\r\n".getBytes());
      os.write("Hello minato. I would like to play your RPG.\r\n".getBytes());
      os.write("Could you please send it to me ?\r\n".getBytes());
      os.write(".\r\n".getBytes());
      os.write("QUIT\r\n".getBytes());
    } catch (Exception e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
      System.exit(1);
    }
  }
}
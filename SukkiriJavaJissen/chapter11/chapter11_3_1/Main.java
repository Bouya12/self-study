import java.net.*;

public class Main {
  public static void main(String[] args) throws Exception {
    System.out.println("‹N“®Š®—¹B");
    ServerSocket svSock = new ServerSocket(39648);
    Socket sock = svSock.accept();
    System.out.println(sock.getInetAddress() + "‚©‚çÚ‘±");
    sock.getOutputStream().write("WELCOME".getBytes());
    sock.getOutputStream().flush();
    sock.close();
    System.out.println("Ú‘±Ø’fB");
  }
}
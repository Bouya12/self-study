import java.net.*;

public class Main {
  public static void main(String[] args) throws Exception {
    System.out.println("�N�������B");
    ServerSocket svSock = new ServerSocket(39648);
    Socket sock = svSock.accept();
    System.out.println(sock.getInetAddress() + "����ڑ�");
    sock.getOutputStream().write("WELCOME".getBytes());
    sock.getOutputStream().flush();
    sock.close();
    System.out.println("�ڑ��ؒf�B");
  }
}
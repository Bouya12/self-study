/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    try {
      // �����I�ɗ�O�𔭐�������
      throw new UnsupportedMusicFileException("���Ή��̃t�@�C���ł�");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
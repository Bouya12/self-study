public class Main {
  public static void main(String[] args) {
    String folder1 = "c:\\javadev";
    String folder2 = "c:\\user\\";
    String file = "readme.txt";
    String path1 = concatFilePath(folder1, file);
    String path2 = concatFilePath(folder2, file);
    System.out.println(path1);
    System.out.println(path2);
  }
  public static String concatFilePath (String folder, String file) {
    if (!folder.endsWith("\\")) {
      folder += "\\";
    }
    return folder;
  }
}
import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;

public class Main {
  public static void main(String[] args) {
    try (InputStream is = new FileInputStream("rpgsave.xml");) {
      Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(is);
      Element hero = doc.getDocumentElement();
      Element weapon = findChildByTag(hero, "weapon");
      Element power = findChildByTag(weapon, "power");
      String value = power.getTextContent();
      System.out.println(value);
    } catch (Exception e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
      System.exit(1);
    }
  }

  static Element findChildByTag(Element self, String name) throws Exception {
    NodeList children = self.getChildNodes();
    for (int i = 0; i < children.getLength(); i++) {
      if (children.item(i) instanceof Element) {
        Element e = (Element) children.item(i);
        if (e.getTagName().equals(name)) {
          return e;
        }
      }
    }
    return null;
  }
}
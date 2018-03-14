package data;

import java.io.FileWriter;

public class UserIO {
  public static void write(business.User user, String path) throws java.io.IOException {
      FileWriter fw = new FileWriter(path, true);
      fw.write(user.getName() + "|" + user.getEmail());
      fw.write(System.lineSeparator());
      fw.close();

  }
}

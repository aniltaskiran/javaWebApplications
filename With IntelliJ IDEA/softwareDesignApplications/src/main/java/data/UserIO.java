package data;

import java.io.FileWriter;
import data.User;

public class UserIO {
    public static void write(User user, String path) throws java.io.IOException {
        FileWriter fw = new FileWriter(path, true);
        fw.write(user.getName() + "|" + user.getEmail());
        fw.write(System.lineSeparator());
        fw.close();

    }
}

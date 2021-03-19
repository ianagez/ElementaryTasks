package task5;

//import lombok.SneakyThrows;

import java.io.IOException;

public class Utils {


    public static String getJsonStringFromFile(String filePath) {
        try {
            return new String(Utils.class.getResourceAsStream(filePath).readAllBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

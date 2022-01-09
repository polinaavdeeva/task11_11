package Utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class utils {

    public static String readStringFromFile(String fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName), "UTF-8");
        return scanner.nextLine();
    }
}

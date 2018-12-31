package ie.gmit.sw;

//This class deals with the parsing
//calculate takes in strings so Files->String-> String bits for comparsion

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Parser {

    //reads a file and converts it to string
    public String readFile(String pathname) throws IOException {

        File file = new File(pathname);
        StringBuilder fileContents = new StringBuilder((int) file.length());

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                fileContents.append(scanner.nextLine() + System.lineSeparator());
            }
            return fileContents.toString();
        }

    }
}

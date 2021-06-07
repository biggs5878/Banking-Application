import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileReader {
    public String getName(int id) {
        try {
            Scanner reader = new Scanner(new File("src//data.csv"));
            reader.useDelimiter(",");
            while (reader.hasNextLine()) {
                int inputId = Integer.parseInt(reader.next());
                if (inputId == id) {
                    return reader.next();
                }
                reader.nextLine();
            }
            return "ID Not Found";
        } catch (FileNotFoundException ex) {
            return "FileNotFoundException";
        }
    }
    public String getChecking(int id) {
        try {
            Scanner reader = new Scanner(new File("src//data.csv"));
            reader.useDelimiter(",");
            while (reader.hasNextLine()) {
                int inputId = Integer.parseInt(reader.next());
                if (inputId == id) {
                    reader.next();
                    return reader.next();
                }
                reader.nextLine();
            }
            return "ID Not Found";
        } catch (FileNotFoundException ex) {
            return "FileNotFoundException";
        }
    }
    public String getSavings(int id) {
        try {
            Scanner reader = new Scanner(new File("src//data.csv"));
            reader.useDelimiter(",");
            while (reader.hasNextLine()) {
                int inputId = Integer.parseInt(reader.next());
                if (inputId == id) {
                    reader.next();
                    reader.next();
                    return reader.next();
                }
                reader.nextLine();
            }
            return "ID Not Found";
        } catch (FileNotFoundException ex) {
            return "FileNotFoundException";
        }
    }
}

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
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

    public void changechecking(int id, int amount) {

        try {
            File temp = new File("src//tempdata.csv");
            File data = new File("src//data.csv");
            FileWriter writer = new FileWriter(temp);
            Scanner reader = new Scanner(data);
            reader.useDelimiter(",");


            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                int inputId = Integer.parseInt(reader.next());
                if (inputId == id) {
                    writer.write(id+",");
                    int checking = Integer.parseInt(reader.next()) + amount;
                    writer.write(checking+",");
                    writer.write(reader.next()+System.lineSeparator());
                }
                else writer.write(line);
                reader.nextLine();
            }
            //boolean success = temp.renameTo(data);
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        }
    }
}

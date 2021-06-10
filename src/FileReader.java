import java.io.*;
import java.util.Scanner;
import java.util.Random;
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

    public void changeBalance(int id, double amount, boolean ischecking) {
        // copies data to temp, deletes everything in data and copies everything from temp back to data with modifications
        try {
            File temp = new File("src//tempdata.csv");
            File data = new File("src//data.csv");
            BufferedWriter copyWriter = new BufferedWriter(new FileWriter(temp,false));
            Scanner reader = new Scanner(temp);
            Scanner copyReader = new Scanner(data);

            while (copyReader.hasNextLine()) {
                String copyLine = copyReader.nextLine();
                copyWriter.write(copyLine+"\n");
            }
            copyWriter.flush();
            copyWriter.close();
            copyReader.close();
            BufferedWriter writer = new BufferedWriter(new FileWriter(data,false));

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] lineElements = line.split(",");
                if (Integer.parseInt(lineElements[0]) == id) {
                    if (ischecking) {
                        writer.write(lineElements[0]+","+lineElements[1]+","+(Double.parseDouble(lineElements[2])+amount)+","+lineElements[3]+"," +System.lineSeparator());
                    }else{
                        writer.write(lineElements[0]+","+lineElements[1]+","+ lineElements[2]+","+(Double.parseDouble(lineElements[3])+amount)+ "," +System.lineSeparator());
                    }
                   
                }
                else writer.write(line+System.lineSeparator());
            }
            writer.flush();
            writer.close();
            reader.close();
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        }
    }
    public int  newaccount(String name ) {
        try {
            Random r = new Random();
            File data = new File("src//data.csv");
            boolean isunique = true;
            int id;
            do {
              isunique = true;
                 id = 100000000 + r.nextInt(900000000);
                Scanner reader = new Scanner(data);
                while (reader.hasNextLine()){
                    String[] lineelements = reader.nextLine().split(",");
                    if (Integer.parseInt(lineelements[0] )== id){
                        isunique = false;
                        break;
                    }
                }
            } while (!isunique);

            BufferedWriter writer = new BufferedWriter(new FileWriter(data,true));
            writer.write(id +","+ name +","+ 0 +","+ 0 +"," +System.lineSeparator());
            writer.flush();
            writer.close();
            return id;
        } catch (IOException ex) {

        } return 0;

    }
    public void removeaccount(int id){
        try {
            File temp = new File("src//tempdata.csv");
            File data = new File("src//data.csv");
            BufferedWriter copyWriter = new BufferedWriter(new FileWriter(temp,false));
            Scanner reader = new Scanner(temp);
            Scanner copyReader = new Scanner(data);

            while (copyReader.hasNextLine()) {
                String copyLine = copyReader.nextLine();
                copyWriter.write(copyLine+"\n");
            }
            copyWriter.flush();
            copyWriter.close();
            copyReader.close();
            BufferedWriter writer = new BufferedWriter(new FileWriter(data,false));

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] lineElements = line.split(",");
                if (Integer.parseInt(lineElements[0]) != id) {
                    writer.write(line+System.lineSeparator());

                }

            }
            writer.flush();
            writer.close();
            reader.close();
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        }

    }
}

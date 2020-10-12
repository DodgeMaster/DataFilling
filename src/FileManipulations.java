import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileManipulations {
    private String directory;

    public void setDirectory(String directory) {
        this.directory = "data/" + directory + ".txt";
    }

    public void createFile() {
        File file = new File(directory);
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeToFile(String string) throws IOException {
        try {
            FileWriter writer = new FileWriter(directory);
            writer.write(string);
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}


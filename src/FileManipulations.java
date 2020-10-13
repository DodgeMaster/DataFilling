import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileManipulations {
    private String directory;

    public void createDirectory(){
        File file = new File("data");
        boolean bool = file.mkdirs();
        if(!bool) System.out.println("Sorry couldn't create specified directory");
    }

    public void setDirectory(String directory) {
        this.directory = "C:\\Users\\kural\\IdeaProjects\\DataFilling\\data\\" + directory + ".txt";
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
            FileWriter writer = new FileWriter(directory, true);
            writer.write(string);
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}


import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String cinemaData[] = {"Test", "Dev", "Lab"};
        FileManipulations file = new FileManipulations();
        Data data = new Data();
        file.setDirectory("test");

        file.createFile();
        data.addData(cinemaData);

        //shortcuts
        String randomValue = data.getDataSet().get(data.randomOutputOneValue());
        String commandSQL = "insert into values(" + randomValue;

        file.writeToFile(commandSQL);
    }
}

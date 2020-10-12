import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Data {
    private ArrayList<String> dataSet = new ArrayList<>();

    public void addData(String data[]){
        dataSet.addAll(Arrays.asList(data));
    }

    public ArrayList<String> getDataSet() {
        return dataSet;
    }

    public int randomOutputOneValue(){
        int size = dataSet.size();
        Random random = new Random();
        return random.nextInt(size);
    }
}

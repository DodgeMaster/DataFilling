public class Main {
    public static void main(String[] args) {
        String cinemaData[] = {"Test", "Dev", "Lab"};
        Data data = new Data();
        data.addData(cinemaData);
        String randomValue = data.getDataSet().get(data.randomOutputOneValue());

        System.out.println();
    }
}

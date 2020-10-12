import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] cinemaNames = {"RIO", "Forum", "Cinamon", "APOLLO", "Very Velly", "Grand Cinema"};
        String[] producers = {"J. J. Abrams", "Tim Burton", "Dean Devlin", "Peter Jackson", "Leonardo DiCaprio", "Mervyn LeRoy", "Arnon Milchan", "Scott Mosier"};
        String[] hallID = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14","15"};
        String[] filmLength = {"83", "80", "124", "115", "169", "121", "157", "113", "62"};

        //Data definitions
        Data cinemaNameList = new Data();
        Data producerNameList = new Data();
        Data hallIDList = new Data();
        Data filmLengthList = new Data();

        FileManipulations file = new FileManipulations();

        //SET FILE NAME!!!!
        file.setDirectory("Object_related_table_data");

        file.createFile();
        cinemaNameList.addData(cinemaNames);
        producerNameList.addData(producers);
        hallIDList.addData(hallID);
        filmLengthList.addData(filmLength);

        //constants
        String OBJECT_RELATED_CINEMA = "OBJECT_TABLE_CINEMA";
        String COLLECTION_FILMS = "COLLECTION_FILMS";
        String COLLECTION_SCHEDULE = "COLLECTION_SCHEDULE";
        String TYPE_SCHEDULE = "TYPE_SCHEDULE";
        String TYPE_FILMS = "TYPE_FILMS";
        String TYPE_CINEMA = "TYPE_CINEMA";

        //save to file process
        file.writeToFile("Begin \nInsert all\n");

        for (int i = 0; i < 1000; i++) {
            String cinemaNameRandomValue = cinemaNameList.getDataSet().get(cinemaNameList.randomOutputOneValue());
            String produceNameRandomValue = producerNameList.getDataSet().get(producerNameList.randomOutputOneValue());
            String hallIDRandomValue = hallIDList.getDataSet().get(hallIDList.randomOutputOneValue());
            String filmLengthRandomValue = filmLengthList.getDataSet().get(filmLengthList.randomOutputOneValue());

            String commandSQL = "   into " + OBJECT_RELATED_CINEMA + " values(" + TYPE_CINEMA + "('" + cinemaNameRandomValue + "', "
                    + COLLECTION_FILMS + "(" + TYPE_FILMS + "('" + produceNameRandomValue + "', '" + hallIDRandomValue + "', "
                    + COLLECTION_SCHEDULE + "(" + TYPE_SCHEDULE + "('" + filmLengthRandomValue + "'))))))";

            file.writeToFile(commandSQL + "\n");
        }

        file.writeToFile("Select * from dual;\nEnd;");
    }
}

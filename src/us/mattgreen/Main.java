package us.mattgreen;

import java.util.ArrayList;

public class Main {

    private final static FileOutput outFile = new FileOutput("animals.txt");
    private final static FileInput inFile = new FileInput("animals.txt");

    public static void main(String[] args) {

        try {
            ArrayList<Talkable> zoo = new ArrayList<>();

            CreateAnimalCollection animalCollection = new CreateAnimalCollection(zoo);
            animalCollection.askForAnimalType();
            animalCollection.askForAnimalType();
            animalCollection.askForAnimalType();

            for (Talkable thing : zoo) {
                printOut(thing);
            }
            outFile.fileClose();
            inFile.fileRead();
            inFile.fileClose();

            FileInput indata = new FileInput("animals.txt");
            String line;
            while ((line = indata.fileReadLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void printOut(Talkable p) {
        System.out.println(p.getName() + " says=" + p.talk());
        outFile.fileWrite(p.getName() + " | " + p.talk());
    }
}

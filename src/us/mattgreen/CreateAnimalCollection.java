package us.mattgreen;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class CreateAnimalCollection {

    private List<Talkable> animals;
    private Scanner keyboard;

    public CreateAnimalCollection(ArrayList animals) {
        this.animals = animals;
    }

    public List<Talkable> getAnimals() {
        return animals;
    }


    public void askForAnimalType() {
        keyboard = new Scanner(System.in);

        System.out.println("Dog or Cat or Teacher??");
        String choice = keyboard.nextLine();

        if (Objects.equals(choice, "dog")) {

            System.out.println("Friendly? True or False");
            boolean friendly = Boolean.parseBoolean(keyboard.nextLine());
            System.out.println("Name?");
            String name = keyboard.nextLine();

            this.animals.add(new Dog(friendly, name));

        } else if (Objects.equals(choice, "Cat")) {
            System.out.println("Mouses killed?");
            int killed = Integer.parseInt(keyboard.nextLine());
            System.out.println("Name?");
            String name = keyboard.nextLine();

            this.animals.add(new Cat(killed, name));

        } else if (Objects.equals(choice, "teacher")) {
            System.out.println("Age?");
            int age = Integer.parseInt(keyboard.nextLine());
            System.out.println("Name?");
            String name = keyboard.nextLine();

            this.animals.add(new Teacher(age, name));

        }

    }
}

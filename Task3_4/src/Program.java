import java.io.*;
import java.util.Scanner;

public class Program {
    public static void main (String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Menu: 1 - SaveObjects, 2 - ReadObjects, Option");
            System.out.println("Choose option:");
            int num = input.nextInt();

            if (num == 1) {
                System.out.println("Your choice Option1");

                SaveObjects();
            }

            if (num == 2) {
                System.out.println("Your choice Option2");
                ReadObject();
            }

            if (num == 3) {
                System.out.println("Your choice Option3 - Quit");
                break;
            }

            if (num > 3 ) {
                throw new WrongChoiceException("Choose option from 1 to 3");
            }
        }
    }

    private static void SaveObjects()
    {
        try (ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream(".\\src\\object.txt"))) {
            Diplodoc firstDiplodoc = new Diplodoc(3,500,"Nick", "Young Grass", 15,"USA", "Minnesota");
            Diplodoc secondDiplodoc = new Diplodoc(2,400,"Nick's son", "Shrub", 8,"USA", "Minnesota");
            Herbivore herbivore = new Herbivore(3,5,"Jon", "Flower","USA", "Minnesota");
            out.writeObject(firstDiplodoc);
            out.writeObject(secondDiplodoc);
            out.writeObject(herbivore);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Objects were saved");
    }

    private static void ReadObject()
    {
        try (ObjectInputStream in = new ObjectInputStream(
                new FileInputStream(".\\src\\object.txt"))) {
            Diplodoc restoredDiplodoc = (Diplodoc)in.readObject();
            Diplodoc secondDiplodoc = (Diplodoc)in.readObject();
            Herbivore herbivore = (Herbivore)in.readObject();
            System.out.print(restoredDiplodoc);
            System.out.println("\n");
            System.out.print(secondDiplodoc);
            System.out.println("\n");
            System.out.print(herbivore);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}



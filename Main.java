import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many members do you want to add: ");
        byte number = scanner.nextByte();

        Person[] list = new Person[number];
        for (byte i = 0; i < list.length; i++) {
            Person person = new Person();
            System.out.print("Enter the name of person " + (i + 1) + ": ");
            person.name = scanner.next();
            System.out.print("Enter the age of person " + (i + 1) + ": ");
            person.age = scanner.nextByte();
            System.out.print("Enter the tall (in cm) of person " + (i + 1) + ": ");
            person.tall = scanner.nextFloat();
            list[i] = person;
        }

        System.out.println("\nFamily Members:");
        for (byte i = 0; i < list.length; i++) {
            System.out.println((i + 1) + ". " + list[i].name + ", Age: " + list[i].age + ", tall: " + list[i].tall + " cm");
        }

        System.out.println("\nTotal number of family members: " + number);

        // Close the scanner
        scanner.close();
    }
}

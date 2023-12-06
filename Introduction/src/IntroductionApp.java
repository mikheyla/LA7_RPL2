import java.util.Scanner;

public class IntroductionApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        Person person = new Person(name, age);

        System.out.println("\nIntroduction:");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        System.out.println("\nHello, " + person.getName() + "! Welcome to the Introduction App!");
    }
}

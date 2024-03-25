import java.util.Scanner;

public class PassportFormCreator{
    public void createForms(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your surname: ");
        String surname = scanner.nextLine();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println(name + " " + surname + " " + age*10);
        System.out.println(name.toUpperCase());
        System.out.println(surname.toUpperCase());
        System.out.println(age*10);
        scanner.close();

    }
    public static void main(String[] args) {
        PassportFormCreator pass = new PassportFormCreator();
        pass.createForms();
    }

}
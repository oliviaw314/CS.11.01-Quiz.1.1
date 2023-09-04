import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter your first name");
        String firstName = scanner.nextLine();
        System.out.println("Enter your favourite food");
        String favouriteFood = scanner.nextLine();
        System.out.println("Age: "+age+", First Name: "+firstName+", Favourite Food: "+favouriteFood);
    }
}

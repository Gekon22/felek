import java.util.Scanner;

public class CustomScanner {

    // comment for master

/*    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie swe prosze");
        String name = scanner.nextLine();
        System.out.println("Czesc " + name + "!");
    }*/

     

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number please");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number please");
        int secondNumber = scanner.nextInt();
        int thirdNumber = firstNumber + secondNumber;
        System.out.println("And the result of adding these numbers is: " + thirdNumber);

        // comment for feature
        // change

    }
}

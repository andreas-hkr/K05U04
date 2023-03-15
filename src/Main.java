import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Läs in en text och skriv ut den baklänges

        Scanner input = new Scanner(System.in);
        System.out.print("Ange en text: ");
        String text = input.nextLine();

        for (int i=text.length()-1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }
    }
}
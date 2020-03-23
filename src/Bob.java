import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Say something to Bob");
        String input = scanner.nextLine();
        do {
            if (input.endsWith("?")) {
                System.out.println("Sure.");
            } else if (input.endsWith("!")) {
                System.out.println("Whoa, calm down!");
            } else if (input.trim().equals("")) {
                System.out.println("Fine. Be that way.");
            } else {
                System.out.println("Whatever.");
            }

            input = scanner.nextLine();
        } while (!input.equals("..."));
    }
}

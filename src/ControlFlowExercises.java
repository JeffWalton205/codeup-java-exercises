import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
        //Counts out every number starting at five and ending at 15
//        int i = 5;
//        while (i <= 15) {
//            System.out.printf("%s ", i++);
//        }
//        System.out.println();


        //Counts out every other number between 0 and 100
//        int x = 0;
//        do {
//            System.out.println(x);
//            x += 2;
//        } while (x <= 100);

       //Counts backwards from by 5's from 100 to -10

//        int x = 100;
//        do {
//            System.out.println(x);
//            x -= 5;
//        } while (x >= -10);

       // starting at 2, square each number while it's less than 1 million

//       long x = 2;
//       do {
//           System.out.println(x);
//           x *= x;
//       } while (x < 1000000);

        // Refactor for for-loops
//        for (int i = 5; i <=15; i++) {
//            System.out.println(i);
//        }

//        for (int i = 0; i <= 100; i += 2) {
//            System.out.println(i);
//        }

//         for (int i = 100; i >= -10; i -= 5) {
//             System.out.println(i);
//         }

//        for (long i = 2; i < 1000000; i *= i) {
//            System.out.println(i);
//        }

//        Fizzbuzz

//        for (int i = 1; i <= 100; i++) {
//            if (i % 15 == 0) {
//                System.out.println("FizzBuzz!");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz!");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz!");
//            } else {
//                System.out.println(i);
//            }
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gimme an integer");
        int userInput = scanner.nextInt();

        System.out.println("Here's your table:");

        System.out.println(" Number |  Squared  | Cubed");
        System.out.println(" ------ |  -------  | -----\n");


        for (int i = 1; i <= userInput; i++) {
            System.out.printf("");
        }


        //%-9d%





    }
}

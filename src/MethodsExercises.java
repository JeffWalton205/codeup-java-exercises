public class MethodsExercises {
//    Basic arithmetic methods
    public static int addition(int x, int y) {
        return x + y;
    }

    public static int subtraction(int x, int y) {
        return x - y;
    }

    public static int multiplication(int x, int y) {
        return x * y;
    }

    public static int division(int x, int y) {
        return x / y;
    }

//    Add modulus
    public static int modulus(int x, int y) {
        return x % y;
    }

//    BONUS: Create a multiplication method without using *



    public static void main(String[] args) {
        System.out.println(addition(1,2));
        System.out.println(subtraction(5, 3));
        System.out.println(multiplication(3, 2));
        System.out.println(division(100, 20));
        System.out.println(modulus(10,2));
    }



}

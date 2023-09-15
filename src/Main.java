public class Main {

    public static void main(String[] args) {

        morningGreeting("Sebastian");
        afternoonGreeting("Sebastian");
        triple("abc");
        roundPositiveValueToNearestInteger(1.6);
        roundNegativeValueToNearestInteger(-2.2);



    }

    // 1. add
    public static int add(int a, int b) {
        return (a + b);
    }


    // 2. add
    public static int add2(int a, int b, int c, int d) {
        return (add(add(a, b), add(c, d)));
    }


    // 3. morningGreeting
    public static String morningGreeting(String name) {
        return "早上好" + name;

    }


    // 4. afternoonGreeting

    public static String afternoonGreeting(String name) {
        return "下午好" + name;
    }

    // 5. triple
    public static String triple(String sentence) {
        return  sentence + sentence + sentence;
    }

    // 6. half

    public static double half(int a) {
        return (a/2);
    }

    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double a) {
        int integer = (int) (a*2);
        return (integer/2);
    }


    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double a) {
        int integer = (int) (a*2);
        return (integer/2);
    }

}

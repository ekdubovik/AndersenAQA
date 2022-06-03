package homework1;

public class HomeWorkApp {
    public static void main(String[] args) {
        // second task
        printThreeWords();
        System.out.println("-------------");
        //third task
        checkSumSign();
        System.out.println("-------------");
        //fourth task
        printColor();
        System.out.println("-------------");
        //fifth task
        compareNumbers();

    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = 10;
        if (a + b >= 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Negative number");
        }
    }

    public static void printColor() {
        int value = 120;
        if (value <= 0) {
            System.out.println("Red");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Yellow");
        }
        if (value > 100) {
            System.out.println("Green");
        }
    }

    public static void compareNumbers() {
        int a = 5;
        int b = 10;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}

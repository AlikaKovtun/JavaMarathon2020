package day18;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(count7(717771237));

    }

    public static int count7(int number) {
        if (number / 10 < 1) {
            if (number % 10 == 7) return 1;
            else return 0;
        }
        int counter = 0;
        if (number % 10 == 7)
            return counter = 1 + count7(number / 10);
        else return counter = 0 + count7(number / 10);
    }
}

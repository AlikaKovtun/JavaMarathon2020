package day8;

public class Task1 {
    public static void main(String[] args) {

        long startString = System.currentTimeMillis();
        String s1 = "";
        for (int i = 0; i <= 20000; i++) {
            s1 += i + " ";

        }
        System.out.println(s1);
        long finishString = System.currentTimeMillis();

        long startStringBuilder = System.currentTimeMillis();
        StringBuilder s2 = new StringBuilder();
        for (int i = 0; i <= 20000; i++) {
            s2.append(i).append(" ");
        }
        System.out.println(s2.toString());
        long finishStringBuilder = System.currentTimeMillis();

        System.out.println("Время затраченное с использованием String: " + (finishString - startString));
        System.out.println("Время затраченное с использованием StringBuilder: " + (finishStringBuilder - startStringBuilder));


    }
}

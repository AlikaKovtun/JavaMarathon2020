package day4;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {

        int array[][] = new int[12][8];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 50);
            }
        }

        int sum = 0;
        int maxSum = 0;
        int index = 0;

        System.out.println(Arrays.deepToString(array));

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            if (sum >= maxSum) {
                index = i;
                maxSum = sum;
            }
            sum = 0;
        }

        System.out.println("Индекс строки, сумма чисел в которой максимальна: " +  index);
    }
}

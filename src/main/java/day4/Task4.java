package day4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {

        int array[] = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10000);
        }

        System.out.println(Arrays.toString(array));
        int sum = 0;
        int maxSum = 0;
        int index = 0;

        for (int i = 0; i < array.length - 2; i++) {
            sum = array[i] + array[i + 1] + array[i + 2];
            if (sum > maxSum) {
                maxSum = sum;
                index = i;
            }
            sum = 0;
        }

        System.out.println(maxSum);
        System.out.println(index);

    }
}

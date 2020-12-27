package day4;


public class Task2 {
    public static void main(String[] args) {

        int array[] = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10000);
        }

        int max = array[0];
        int min = array[0];
        int counter = 0;
        int sum = 0;

        for (int number : array) {
            if (number < min) min = number;
            else if (number > max) max = number;
            if (number % 10 == 0) {
                counter++;
                sum += number;
            }
        }

        System.out.println("Наименьший элемент массива: " + min);
        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + counter);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + sum);

    }
}

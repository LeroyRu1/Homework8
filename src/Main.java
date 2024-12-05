import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Задача 1
        int[] numbers = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(numbers));

        double[] arrays = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(arrays));

        int[] numbersNew = {5, 17, 19};
        System.out.println(Arrays.toString(numbersNew));

        //Задача 2
        for (int i = 0; i < numbers.length; i++) {
            System.out.print((numbers[i]));
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < arrays.length; i++) {
            System.out.print((arrays[i]));
            if (i < arrays.length - 1) {
                System.out.print(", ");

            }
        }
        System.out.println();
        for (int i = 0; i < numbersNew.length; i++) {
            System.out.print((numbersNew[i]));
            if (i < numbersNew.length - 1) {
                System.out.print(", ");

            }
        }
        //Задача 3
        System.out.println();
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print((numbers[i]));
            if (i > 0) {
                System.out.print(", ");
            }
        }

        System.out.println();
        for (int i = arrays.length - 1; i >= 0; i--) {
            System.out.print((arrays[i]));
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = numbersNew.length - 1; i >= 0; i--) {
            System.out.print((numbersNew[i]));
            if (i > 0) {
                System.out.print(", ");
            }
        }

        //Задача 4
        System.out.println();
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arr.length; i++) {
            if (arr [i] % 2 != 0) {
            arr [i]++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
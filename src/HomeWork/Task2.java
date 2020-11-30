package HomeWork;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        //Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        int[] arr = new int[8];
        System.out.println(Arrays.toString(arr));
        int b = 0;
        for (int i = 0; i < arr.length; i++){
            arr[i]=b;
            b = b+3;
        }

        System.out.println(Arrays.toString(arr));
    }
}

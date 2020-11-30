package HomeWork;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        //Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        int a = 5;

        int[] [] arr = new int[a][a];
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                if(i==j){
                    arr[i][j]=1;}
                if(a-1==j){
                    arr[i][j]=1;
                    a=a-1;}
                }
            }
            //System.out.println(Arrays.toString(arr[i]));

            for (int i = 0; i < arr.length; i++) {

            System.out.println(Arrays.toString(arr[i]));
            }
        }
    }


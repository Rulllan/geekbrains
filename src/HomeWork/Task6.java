package HomeWork;


public class Task6 {
    public static void main(String[] args) {
        //  ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
        //  если в массиве есть место, в котором сумма левой и правой части массива равны.
        //  Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
        //  граница показана символами ||, эти символы в массив не входят.
        //int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        // check(1,5,3,2,11,4,5,2,4,8,9,1);
        int[] arr = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 } ;
        int sum = 0;
        //for (i = 0; i < arr.length; i++) {
        //    sum = arr[i] + sum;
      // }
        int sum2 = 0;
        for (i = 0; i < arr.length - 1; i++) {
            sum2 = sum2 + arr[i];
            System.out.println(sum2 == sum - sum2);
        }

    }

}

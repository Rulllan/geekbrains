package lesson1;

public class Main {
    public static void main(String[] args) {
          //2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
        byte  a = 1;
        short e = 1;
        int   b = 2;
        long   q = 2;
        float   w = 2;
        double с = 3;
        boolean r = true;
        char d = 154;
        String Str = "Строка";

//        3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;
        int a1 = 1; int b1 = 2;int c1 = 3; int d1 = 4;
        System.out.println("Результат задания 3:" + calculate(a1, b1, c1, d1));
        // 4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
        int a3; int a4;  a3 = 10;  a4 = 4;
        System.out.println("Результат задания 4:" +ProverkaChisel(a3, a4));
//        5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
        int a5 = 0;
        //a5 = 0;
        ProverkaPlus(a5);
//        6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
        int a6 = 10;
        System.out.println("Результат задания 6:"+ ProveritMinus(a6));
//        7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
        String Name ="Имя";
        PrintName(Name);

//        8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
        int year = 4;
        ProveritGod(year);
    }

    private static void ProveritGod(int year) {
        if (year % 4== 0 ) {
            if (year % 400 == 0) {
                System.out.println("Результат задания 8: Високосный");
            }
            if (year % 100 == 0 & year % 400 != 0){
                System.out.println("Результат задания 8: НЕ Високосный");
            }
            else if (year % 4 == 0 & year % 400 != 0){
                System.out.println("Результат задания 8:  Високосный");
            }
        }
        else {
            System.out.println("Результат задания 8: НЕ Високосный");
        }
    }

    private static boolean ProveritMinus(int a6) {
        if (a6<0){
            return true;
        }
        else{
            return false;
        }
    }

    private static void PrintName(String Name) {
        System.out.println("Результат задания 7: Привет," +Name);
    }

    private static int calculate(int a1,int b1,int c1,int d) {
        return a1 * (b1 + (c1 / d)) ;
    }

    private static void ProverkaPlus(int a3) {
        if (a3<0){
            System.out.println("Результат задания 5 отрицательное");
        }
        else{
            System.out.println("Результат задания 5 положительное");
        }
    }

    private static boolean ProverkaChisel(int a1, int a2) {
        int c = a1 + a2;
        if (c < 20 & c > 10) {
            return true;
        }
        return false;
    }
}


import java.util.Scanner;

public class main {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Введите три числа: ");
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();

        int sredn = (x+y+z)/3;  // Запись в переменную среднего арифметического

        System.out.println("Среднее арифметическое чисел: " + sredn);

        int del = sredn/2; // деление среднего арифметического на 2 без остатка

        if (del > 3) {
            System.out.println ("Программа выполнена корректно");
        }







    }

}

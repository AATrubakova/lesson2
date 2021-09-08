package ru.geekbrains.courses.java.anna.lesson2;

import java.util.Scanner;

public class HomeWork2 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Выберите метод от 1 до 5:");
        System.out.println("1. Метод sumOfNumbers() определяет лежит ли сумма чисел в диапазоне от 10 до 20");
        System.out.println("2. Метод определяет является ли число положительным или отрицательным");
        System.out.println("3. Метод возвращает true, если число отрицательное и false - если положительное");
        System.out.println("4. Метод печатает строку указанное число раз");
        System.out.println("5. Метод isYearLeap() проверяет является ли год високосным");
        int method = scanner.nextInt();
        switch (method) {
            case 1:
                System.out.println("Введите целое число x1:");
                int x1 = scanner.nextInt();
                System.out.println("Введите целое число x2:");
                int x2 = scanner.nextInt();
                System.out.println(sumOfNumbers(x1, x2));
                break;
            case 2:
                System.out.println("Введите целое число a:");
                int a = scanner.nextInt();
                whatIsNumber(a);
                break;
            case 3:
                System.out.println("Введите целое число b:");
                int b = scanner.nextInt();
                isNumberAboveZero(b);
                System.out.println(isNumberAboveZero(b));
                break;
            case 4:
                System.out.println("Введите строку:");
                String s = scanner.nextLine();
                System.out.println("Введите число повторов n:");

//                System.out.println("Введите строку:" + s);
                int n = scanner.nextInt();
//                System.out.println("Введите число повторов n:" + n);
                printStringN(s,n);
                break;
            case 5:
                System.out.println(isYearLeap());
                break;
        }
        scanner.close();
    }
    public static boolean sumOfNumbers(int x1, int x2) {
        int sum = x1 + x2;
        System.out.println("Сумма чисел " + x1 + " + " + x2 + " = " + sum);
        if (sum >= 10 && sum <= 20)
            return true;
        else
            return false;
    }
    public static void whatIsNumber(int a) {
        if (a >= 0)
            System.out.println("Число " + a + " положительное!");
        else
            System.out.println("Число " + a + " отрицательное!");;
    }
    public static boolean isNumberAboveZero(int b) {
        return b < 0;
    }
    public static void printStringN(String s, int n) {
        for (int i=0; i < n; i++) System.out.println(s);
    }
    public static boolean isYearLeap() {
        System.out.println("Введите год:");
        int year = scanner.nextInt();
        if (year >= 1582) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " - високосный год");
                return true;
            } else System.out.println(year + " - невисокосный год");
            return false;
        } else System.out.println("В " + year + " году не использовался григорианский календарь");
        return false;
    }
}
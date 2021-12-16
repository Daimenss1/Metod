package ru.skypro;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        printIsLeapYear(2019); // к первой задаче

        printRecommendApplicationVersion(0, 2016); // к второй задаче

        System.out.println("Количество дней доставки: " + calculateDeliveryDays(90)); // к третье задаче

        findDuplicates(" aabccddefgghiijjkk "); // к четвёртой задаче

        int[] arr = new int[]{3, 2, 1, 6, 5}; // к пятой задаче
        reverseArray(arr);
        System.out.println(" reversed array " + Arrays.toString(arr));
    }

    private static void printIsLeapYear(int i) {
        int year = 2019;
        boolean IsLeap = IsYearLeap(year);
        if (IsLeap) {
            System.out.println(year + " - ялвяется високосным");
        } else {
            System.out.println(year + " - не является високосным");
        }
    }

    public static boolean IsYearLeap(int year) {
        boolean IsLeap = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        System.out.println(" * Задача 1 ");
        return IsLeap;
    }


    public static void printRecommendApplicationVersion(int clientOS, int deviceYear) {
        boolean deviceIsOld = IsDeviceOld(deviceYear);
        System.out.print(" Установите ");
        if (deviceIsOld) {
            System.out.print(" lite ");
        }
        System.out.print(" версию для ");
        if (clientOS == 0) {
            System.out.println(" IOS ");
        } else {
            System.out.println(" Android ");
        }
    }

    private static boolean IsDeviceOld(int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        System.out.println(" * Задача 2 ");
        return deviceYear <= currentYear;
    }


    public static int calculateDeliveryDays(int deliveryDistance) {
        int result = 1;
        System.out.println(" * Задача 3 ");
        if (deliveryDistance > 20) {
            result++;
        }
        if (deliveryDistance > 60) {
            result++;
        }
        return result;
    }


    public static void findDuplicates(String text) {
        char[] letters = text.toCharArray();
        char prevChar = Character.MAX_VALUE;
        for (char letter : letters) {
            if (letter == prevChar) {
                System.out.println(" * Задача 4 ");
                System.out.println(" Найден повторный символ: " + letter);
                return;
            }
            prevChar = letter;
        }
        System.out.println(" Повторых символов не найдено ");
    }

    public static void reverseArray(int[] arr) {
        int head = 0;
        int tail = arr.length - 1;
        System.out.println(" * Задача 5 ");
        while (head < tail) {
            int temp = arr[head];
            arr[head++] = arr[tail];
            arr[tail--] = temp;
        }
    }
}









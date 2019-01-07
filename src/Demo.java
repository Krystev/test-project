import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
//        short s = (short) (1.64 + 3);
//
//        double selary = 1000;
//        byte bonus = 50;
//        byte sales = 99;
//
//        if (sales >= 100) {
//            selary = selary + bonus;
//            System.out.println("IN");
//        }
//
//        System.out.println(selary);
//        System.out.println("OUT");

        Scanner input = new Scanner(System.in);

        System.out.println("Моля въведете сума:");
        int value = input.nextInt();

        System.out.println("Моля изберете валута - USD, EUR или GBP:");
        String currency = input.next();

        if (currency.equals("USD")) {
            System.out.println(value * 1.7408 + " BGN");
        } else if (currency.equals("EUR")) {
            System.out.println(value * 1.955 + " BGN");
        } else if (currency.equals("GBP")) {
            System.out.println(value * 2.6415 + " BGN");
        } else {
            System.out.println("Моля изберете една от трите валути!");
        }

//        boolean isPallindrom = false;
//
//        int a = number / 1000;
//        int b = number % 1000 / 100;
//        int c = number % 100 / 10;
//        int d = number % 10;
//
//        System.out.println("" + a + b + c + d);
//
//        if (a == d && b == c) {
//            isPallindrom = true;
//        }
//
//        System.out.println(isPallindrom);

//        if (number >= 2 && number <= 6) {
//            if (number == 2) {
//                System.out.println("Слаб");
//            } else if (number == 3) {
//                System.out.println("Среден");
//            } else if (number == 4) {
//                System.out.println("Добър");
//            } else if (number == 5) {
//                System.out.println("Мн. Добър");
//            } else {
//                System.out.println("Отличен");
//            }
//        } else {
//            System.out.println("Моля въведете правилна оценка от 2 до 6!");
//        }


//        if (number % 2 == 0) {
//            System.out.println("Even");
//        } else {
//            System.out.println("Odd");
//        }

//        String season = "";
//
//        if (month > 0 && month < 13) {
//            if (month > 0 && month <= 3 || month == 12) {
//                season = "Зима";
//            } else if (month > 3 && month <= 6) {
//                season = "Пролет";
//            } else if (month > 6 && month <= 9) {
//                season = "Лято";
//            } else if (month > 9 && month <= 11) {
//                season = "Есен";
//            }
//
//            System.out.println(season);
//        } else {
//            System.out.println("Моля въведете правелен месец!");
//        }

    }
}

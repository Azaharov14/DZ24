//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        taskOne();
        int year = 2024;
        if (isLeapYear(year)) {
            System.out.println(year + " год - высокосный год ");
        } else {
            System.out.println(year + " год - не высокосный год");
        }
        taskTwo();
        int platform = 0;
        int year2 = 2010;
        isPhonePlatform(platform, year2);
        taskThree();
        int deliveryDistance = 95;
        calculateDeliveryDays(deliveryDistance);
    }
    public static void taskOne() {
        System.out.println(" \n  Задача №1 ");
    }
    public static void taskTwo() {
        System.out.println(" \n Задача №2 ");
    }
    public static void taskThree() {
        System.out.println(" \n  Задача №3 ");
        int deliveryDistance = 95;
        int deliveryDay = calculateDeliveryDays(deliveryDistance);
        if (deliveryDay > 0) {
            System.out.println("Потребуется дней:" + deliveryDay);
        } else {
            System.out.println("Доставки нет");
        }
    }
    public static boolean isLeapYear(int year) {
        // возвращаю true или false в main для последующего анализа (проверил, работает)
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public static void isPhonePlatform(int platform, int year2) {
        boolean yearPhone = year2 <= 2015;
        if (platform == 0 && yearPhone) {
            System.out.print("Установите облегченную версию приложения для iOS по ссылке");
        } else if (platform == 0 && !yearPhone) {
            System.out.print("Установите версию приложения для iOS по ссылке");
        } else if (platform == 1 && yearPhone) {
            System.out.print("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.print("Установите версию приложения для Android по ссылке");
        }
    }
    public static int calculateDeliveryDays(int distance) {
        int day = 0;
        if (distance <= 20) {
            day = 1;
        } else if (distance <= 60) {
            day = 2;
        } else if (distance <= 100) {
            day = 3;
        }
        return day;
    }
}
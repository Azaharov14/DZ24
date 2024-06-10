//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        taskOne();
        int year = 2024;
        isLeapYear(year);

        taskTwo();
        int platform = 0;
        int year2 = 2010;
        isPhonePlatform(platform, year2);

        taskThree();
        int deliveryDistance = 95;
        int term = 1;
        calculateDeliveryDays(deliveryDistance, term);

    }

    public static void taskOne() {
        System.out.println(" \n  Задача №1 ");
    }
    public static void taskTwo() {
        System.out.println(" \n Задача №2 ");
    }
    public static void taskThree() {
        System.out.println(" \n  Задача №3 ");
    }

    public static void isLeapYear(int year) {
        boolean leapYearOn = (year % 4 == 0) && (year % 100 != 0);
        if (year % 4 == 0 || year % 100 != 0 && year % 400 == 0) {
            System.out.print(year + " - високосный год ");
        } else  {
            System.out.print(year + " - не високосный год ");
        }
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

    public static int calculateDeliveryDays(int distance, int day) {
        boolean EstimatedDeliveryTime = (distance >= 0) && (distance < 20);
        if (EstimatedDeliveryTime) {
            System.out.printf("Потребуется дней: %s %n", day);
        } else if (distance >= 20 && (distance < 60)) {
            System.out.printf("Потребуется дней: %s %n", day += 1);
        } else if (distance >= 60 && (distance < 100)) {
            System.out.printf("Потребуется дней: %s %n", day += 2);
        } else {
            System.out.println("Доставка не осущетсвляется");
        }
        return day;
    }
}
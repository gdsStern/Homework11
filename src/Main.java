import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int year = 2024;
        boolean yearLeap = isYearLeap(year);
        if (yearLeap) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        System.out.println("Задание 2");
        int yearProduction = 2019;
        int versionOS = 1;
        printVersionApplication(versionOS,yearProduction);

        System.out.println("Задание 3");
        int deliveryDistance = 95;
        int deliveryDays = calculateDeliveryDays(deliveryDistance);
        if (deliveryDays>0) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("Доставки нет");
        }

    }
    public static boolean isYearLeap(int year) {
        return ((year % 4 == 0 && year % 100 != 0 || year % 400 == 0) && year>=1584);
    }
    public static void printVersionApplication(int versionOS,int yearProduction) {
        int currentYear = LocalDate.now().getYear();
        if (versionOS == 1 && yearProduction < currentYear) {
            System.out.println("Установить облегченную версию для ОС андроид");
        } else if (versionOS == 1 && yearProduction == currentYear) {
            System.out.println("Установить обычную версию для ОС андроид");
        } else if (versionOS == 0 && yearProduction < currentYear) {
            System.out.println("Установить облегченную версию для ОС iphone");
        } else if (versionOS == 0 && yearProduction == currentYear) {
            System.out.println("Установить обычную версию для ОС iphone");
        }
    }
    public static int calculateDeliveryDays(int deliveryDistance) {
        int deliveryDays = 1;
        if (deliveryDistance < 100) {
            if (deliveryDistance > 20) {
                deliveryDays++;
            }
            if (deliveryDistance>60) {
                deliveryDays++;
            }
            return deliveryDays;
        } else {
            return -1;
        }
    }
}
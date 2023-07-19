public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    private static void task1() {
        System.out.println("\nЗадача 1");
        byte clientOS = 0; // 0 — iOS, 1 — Android
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    private static void task2() {
        System.out.println("\nЗадача 2");
        byte clientOS = 1; // 0 — iOS, 1 — Android
        int clientDeviceYear = 2015;
        int checkDeviceYear = 2015;
        boolean isOldDevice = clientDeviceYear < checkDeviceYear;
        if (clientOS == 0) {
            if (isOldDevice) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (isOldDevice) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    private static void task3() {
        System.out.println("\nЗадача 3");
        int year = 2021;
        boolean isFourHundredth = year % 400 == 0;
        boolean isHundredth = year % 100 == 0;
        boolean isFourth = year % 4 == 0;
        if (isFourHundredth || (isFourth && !isHundredth)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    private static void task4() {
        System.out.println("\nЗадача 4");
        int deliveryDistance = 95;
        if (deliveryDistance > 100 || deliveryDistance < 0) {
            System.out.println("Доставки нет");
        } else {
            int day = 1;
            if (deliveryDistance > 20) {
                day++;
                if (deliveryDistance > 60) {
                    day++;
                }
            }
            System.out.println("Потребуется дней: " + day);
        }
    }

    private static void task5() {
        System.out.println("\nЗадача 5");
        int monthNumber = 12;
        System.out.println(
                switch (monthNumber) {
                    case 12, 1, 2 -> "Зима";
                    case 3, 4, 5 -> "Весна";
                    case 6, 7, 8 -> "Лето";
                    case 9, 10, 11 -> "Осень";
                    default -> "Месяца " + monthNumber + " не существует!";
                }
        );
    }

}
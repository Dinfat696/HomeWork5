import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();


    }

    public static void task1() {
        System.out.println("Задача 1");
        char clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientDeviceYear = 2014;
        if (clientDeviceYear < 2015) {
            int clientOS = 1;
            switch (clientOS) {
                case 0:
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    break;
                default:
                    System.out.println("Нет такого");
            }
        } else if (clientDeviceYear >= 2015) {
            System.out.println("Установите  обычное приложение");
        }
    }
}

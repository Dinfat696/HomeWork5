import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();


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

    public static void task3() {
        System.out.println("Задача 3");
        int year = 2020;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 108;
        int deliverDay1 = 1;
        int deliverDay2 = 2;
        int deliverDay3 = 3;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliverDay1);
        }else if((deliveryDistance >= 20) && (deliveryDistance < 60)) {
            System.out.println("Потребуется дней: " + deliverDay2);
        } else if ((deliveryDistance >= 60) && (deliveryDistance < 100)) {
                    System.out.println("Потребуется дней: " + deliverDay3);
                } else {
                    System.out.println("Свыше 100 км доставки нет");
                }
            }
        }





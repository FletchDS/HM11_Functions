import java.time.LocalDate;
import java.util.Random;

public class Main {

    public static void IsYearLeap(int year) {
        if (year % 4 != 0 || (year % 400 != 0 && year % 100 == 0)) {
            System.out.printf("%d год — невисокосный год", year);
        } else {
            System.out.printf("%d год — високосный год", year);
        }
    }

    public static void OsToInstall(byte os, short deviceYear) {
        if (os == 1) {
            System.out.print("Установите " + (deviceYear < LocalDate.now().getYear() ? "облегченную " : "обычную") + " версию приложения для Android по ссылке");
        } else {
            System.out.print("Установите " + (deviceYear < LocalDate.now().getYear() ? "облегченную " : "обычную") + " версию приложения для iOS по ссылке");
        }
    }

    public static void DaysToDelivery(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            System.out.print("Потребуется дней: 1");
        } else if (deliveryDistance <= 60) {
            System.out.print("Потребуется дней: 2 дня");
        } else if (deliveryDistance <= 100) {
            System.out.print("Доставка займет 3 дня");
        } else {
            System.out.print("Доставка невозможна");
        }
    }

    public static void main(String[] args) {
        Random random = new Random();

        //Задача 1
        short year = (short) random.nextInt(1585, 3001);

        System.out.printf("Выбран год %d\n", year);

        IsYearLeap(year);

        System.out.println("\n");

        //Задача 2
        short clientDeviceYear = (short) random.nextInt(2020, 2031);
        byte clientOS = (byte) random.nextInt(0, 2);

        System.out.printf("Индексы ОС: 0 - iOS, 1 - Android\nВыбран индекс %d\nГод создания %d\n", clientOS, clientDeviceYear);

        OsToInstall(clientOS, clientDeviceYear);

        System.out.println("\n");

        //Задача 3
        byte deliveryDistance = (byte) random.nextInt(0, 131);

        System.out.printf("Дистанция до клиента - %d\n", deliveryDistance);

        DaysToDelivery(deliveryDistance);

    }
}
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        //task7();
        //task8();
        //task9();
        //task10();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int bank = 0;
        int deposit = 15000;
        int counter = 0;
        while (bank <= 2459000) {
            bank = bank + deposit;
            counter = bank / deposit;
            System.out.println("Месяц " + counter + ", сумма накоплений равна " + bank + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i = i + 1;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i >= 1; i = i - 1) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        double population = 12_000_000;
        double birthRate = 17 / population * 1000;
        double deathRate = 8 / population * 1000;
        for (int i = 1; i <= 10; i = i + 1) {
            population = population + birthRate - deathRate;
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        double deposite = 15_000;
        int i = 1;
        for (; deposite < 12_000_000; i = i + 1) {
            deposite = deposite + deposite / 100 * 7;
                System.out.println("Месяц " + i + " Накопления = " + deposite);
            }
        }

    public static void task5() {
        System.out.println("Задача 5");
        double deposite = 15_000;
        int i = 1;
        for (; deposite < 12_000_000; i = i + 1) {
            deposite = deposite + deposite / 100 * 7;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " Накопления = " + deposite);
            }
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        double deposite = 15_000;
        int i = 1;
        for (; i <= 108; i = i + 1) {
            deposite = deposite + deposite / 100 * 7;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " Накопления = " + deposite);
            }
        }
    }
}

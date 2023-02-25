public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        //task5();
        //task6();
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
        while (i<10) {
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
        for (int i=1; i <= 10; i=i+1) {
            population = population + birthRate - deathRate;
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }
    }
    public static void task4() {
        int salary = 65535;
        int total = 0;
        int i = 0;
        for (; total < 1_000_000; i++) {
            total = total + total/100;
            total = total + salary;
            if (i % 5 == 0) {
                System.out.println("Месяц " + i + " Итого " + total);
            }
        }
        System.out.println(total);
    }
}

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        //task3();
        //task4();
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

    }
}
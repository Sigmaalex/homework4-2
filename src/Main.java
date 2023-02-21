public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total + i++ < 2_459_000) {
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 1;
        while (11 > i) {
            System.out.print(i);
            i++;
        }
        {
            System.out.println();
        }
        for (int a = 10; a > 0; a = a - 1) {
            System.out.print(a);
        }
        {
            System.out.println();
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int population = 12000000;
        int born = 17;
        int death = 8;
        int number = born - death;
        for (int i = 1; i <= 10; i++) {
            population += population * number / 1000;

            System.out.println("год " + i + " численность населения составляет " + population);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total + i++ < 12_000_000) {
            total = total + (salary * 7 / 100);
            total = total + salary;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int salary = 15000;
        int total = 0;
        int month = 12 * 9;
        for (int i = 1; i < month; i++) {
            total = total + salary * 7 / 100;
            total = total + salary;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " Итого " + total);
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        for (int i = 5; i < 31; i = i + 7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчёт.");
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        for (int year = 0; year <= 2150; year = year + 79) {
            if (year > 1850 && year < 2100) {
                System.out.println(year);
            }
        }
    }
}
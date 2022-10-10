public class Main {
    public static void main(String[] args) {

        System.out.println("Домашнее задание 1");
        System.out.println("Задание 1");
        int deposit = 15000;
        double percent = 12;
        double annualRatet = percent / 100;
        double monthPercent = annualRatet / 12;
        double sum = 0;
        while (sum <= 2_459_000) {
            sum = (sum + deposit) * (1 + monthPercent);
            System.out.println(sum);
        }
        System.out.println("Задание 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();

        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Задание 3");
        int population = 12_000_000;
        int birthRate = 17 * population/1000;
        int mortality = 8 * population/1000;
        int populationGrowthRate = (birthRate - mortality);
        for (int a=1; a<=10; a++) {
            population = populationGrowthRate+population;
            System.out.println("Год " + a + " ,численность населения составляет " + population + " человек");
        }
        System.out.println("Домашнее задание 2");
        System.out.println("Задание 1");
        int deposit1 = 15000;
        int month = 1;
        for (;deposit1 <= 12_000_000; month++) {
            deposit1 *= 1.07;
            System.out.println("Месяц " + month + " ,сумма накоплений равна " + deposit1 + " рублей");
        }
        System.out.println("Задание 2");
        int deposit2 = 15000;
        int month1 = 1;
        while (deposit2 <= 12_000_000) {
            deposit2 *= 1.07;
            if (month1 % 6 == 0) {
                System.out.println("Месяц " + month1 + " ,сумма накоплений равна " + deposit2 + " рублей");
            }
            month1++;
        }
        System.out.println("Задание 3");
        int deposit3 = 15000;
        int depositMonth =1;
        while (depositMonth <= 108) {
            deposit3 *= 1.07;
            if (depositMonth % 6 == 0) {
                System.out.println("Месяц " + depositMonth + " ,сумма накоплений равна " + deposit3 + " рублей");
            }
            depositMonth++;
        }
        System.out.println("Задание 4");
        int firstFriday =1;
        for (int friday = firstFriday; friday<=31; friday = friday + 7 ) {
            System.out.println("Сегодня пятница, " +friday+ "-е число. Необходимо подготовить отчет.");
        }
        System.out.println("Домашнее задание 3");
        System.out.println("Задание 1");
        int currentYear =2022;
        int beginning = currentYear - 200;
        int ending = currentYear + 100;
        for (int c=beginning; c<ending; ++c) {
            if (c % 79 == 0) {
                System.out.println(c);
            }
        }
        System.out.println("Задание 2");
        int a =2;
        int g = 0;
        for (int d=1; d<=10; ++d) {
            g = a * d;
            System.out.println(a + " * " + d + " = " + g);
        }
    }
}
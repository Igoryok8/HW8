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
            //  System.out.println("Месяц " + i + " ,сумма накоплений равна " + sum + " рублей");
            System.out.println(sum);
        }
        //System.out.println(sum);
        //System.out.println(i);
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
    }
}
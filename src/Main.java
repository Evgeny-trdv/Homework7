public class Main {
    public static void main(String[] args) {
        System.out.println("Homework 7");

        System.out.println("Task first");
        int salary = 15000;
        int i = 1;
        int total = 0;
        while (total <= 2459000) {
            System.out.println("Месяц " + i++ + " , сумма накоплений равна " + (total = total + salary) + " рублей");
        }

        System.out.println("Task second");
        int a = 1;
        int z = 10;
        while (a <= z) {
            System.out.print(a++ + " ");
        }
        System.out.println();
        while (z >= 1) {
            System.out.print(z-- + " ");
        }

        System.out.println("Task third");
        double countryY = 12000000.0;
        double birthRateInYear = 17.0 / 1000.0 * countryY;
        double deathRateInYear = 8.0 / 1000.0 * countryY;
        int year = 1;
        while (year <= 10) {
            countryY = countryY + (birthRateInYear - deathRateInYear);
            System.out.println("Год " + year++ + ", численность населения составляет " + (int) countryY);
        }

        System.out.println("Task fourth");
        double deposit = 15000;
        double invest = 0;
        double rate = 1.07;
        int month = 0;
        while (invest <= 12000000) {
            invest = (invest + deposit) * rate;
            month++;
            System.out.println("Месяц " + month + ", на вкладе лежит " + (int) invest);
        }

        System.out.println("Task fifth");
        double deposit5 = 15000;
        double invest5 = 0;
        double rate5 = 1.07;
        int month5 = 0;
        while (invest5 <= 12000000) {
            invest5 = (invest5 + deposit5) * rate5;
            month5++;
            if (month5 % 6 == 0) {
                System.out.println("Месяц " + month5 + ", на вкладе лежит " + (int) invest5);
            }
        }

        System.out.println("Task sixth");
        double deposit6 = 15000;
        double invest6 = 0;
        double rate6 = 1.07;
        int month6 = 0;
        int year6 = 9;
        while (month6 < (year6 * 12)) {
            invest6 = (invest6 + deposit6) * rate6;
            month6++;
            if (month6 % 6 == 0) {
                System.out.println("Месяц " + month6 + ", на вкладе лежит " + (int) invest6);
            }
            if (month6 == (year6 * 12)) {
                System.out.println("За 9 лет Василий накопил " + (int) invest6);
            }
        }

        System.out.println("Task seven");
        int friday = 4;
        int start = 0;
        int end = 31;
        int need = 0;
        do {
            if (start == friday) {
                System.out.println("Сегодня пятница, " + start + "-е число. Необходимо подготовить отчёт");
                start++;
                friday = friday + 7;
            } else {
                start++;
            }
        } while (start <= end);

        System.out.println("Task eight");
        int yearComet = 79;
        int yearStart = 0;
        int yearNow = 2024;
        int yearBefore = yearNow - 200;
        int yearAfter = yearNow + 100;
        while (yearStart <= yearNow) {
            yearStart = yearStart + yearComet;
            if (yearStart >= yearBefore && yearStart <= yearAfter) {
                System.out.println(yearStart);
            }

            }
        }
    }



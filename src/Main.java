import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //Задача 1

        int i = 0;

        while (i < 10) {
            System.out.print(++i + " ");
        }
        System.out.println();

        for (; i > 0; i--) {
            System.out.print(i + " ");
        }


        // Задача 2
        System.out.println();

        int day = 5;

        while (day <= 31) {
            day += 7;
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
        }

        // Задача 3
        System.out.println();

        int currentYear = LocalDate.now().getYear();

        int start = currentYear - 200;
        int end = currentYear + 100;

        for (int year = start; year <= end; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }



        }
    }

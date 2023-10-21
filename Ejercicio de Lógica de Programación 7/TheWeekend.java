package weekend;

import java.util.Scanner;
import java.time.DayOfWeek;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class TheWeekend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dayOfWeek;
        LocalTime userTime;

        // Preguntar el día de la semana
        do {
            System.out.print("Enter a day of the week (Monday - Friday): ");
            dayOfWeek = scanner.nextLine().trim().toLowerCase();
        } while (!dayOfWeek.matches("monday|tuesday|wednesday|thursday|friday"));

        // Validación para la hora
        do {
            System.out.print("Enter the time (HH:MM format): ");
            String time = scanner.nextLine().trim();
            try {
                userTime = LocalTime.parse(time);
                break;
            } catch (Exception e) {
                System.out.println("Invalid time. Please try again.");
            }
        } while (true);

        //Establecer el inicio del fin de semana
        DayOfWeek startOfWeekend = DayOfWeek.FRIDAY;
        LocalTime weekendStartTime = LocalTime.of(15, 0);

      
        DayOfWeek day = DayOfWeek.valueOf(dayOfWeek.toUpperCase());

        // Cálculo
        long minutesUntilWeekend = 0;
        if (day != startOfWeekend || userTime.isAfter(weekendStartTime)) {
            int daysUntilWeekend = (startOfWeekend.getValue() + 7 - day.getValue()) % 7;
            minutesUntilWeekend = daysUntilWeekend * 24 * 60 - ChronoUnit.MINUTES.between(userTime, weekendStartTime);
        }

        //Impresión de los minutos
        if (minutesUntilWeekend > 0) {
            System.out.println("There are " + minutesUntilWeekend + " minutes left until the weekend.");
        } else {
            System.out.println("It's already the weekend!");
        }

        scanner.close();
    }
}


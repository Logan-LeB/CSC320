import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WeeklyTemps {

    public static void main(String[] args) {
        WeeklyTemps program = new WeeklyTemps();
        program.run();
    }

    public void run() {
        DailyTemperature dailyTemps = new DailyTemperature();
        displayTemperature(dailyTemps);
    }

    public void displayTemperature(DailyTemperature dailyTemps) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("\nPlease enter the day of the week (Sunday-Saturday), "
                    + "Week to see temps for the whole week, or Cancel to exit: ");
            String userInput = scanner.nextLine().trim().toLowerCase();

            int dayIndex = -1;
            switch (userInput) {
                case "sunday":
                    dayIndex = 0;
                    break;
                case "monday":
                    dayIndex = 1;
                    break;
                case "tuesday":
                    dayIndex = 2;
                    break;
                case "wednesday":
                    dayIndex = 3;
                    break;
                case "thursday":
                    dayIndex = 4;
                    break;
                case "friday":
                    dayIndex = 5;
                    break;
                case "saturday":
                    dayIndex = 6;
                    break;
                case "week":
                    dayIndex = 7;
                    break;
                case "cancel":
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    dayIndex = -1;
                    break;
            }

            if (dayIndex == -1) {
                System.out.println("Invalid input. Try again.");
            } else if (dayIndex == 7) {
                float weeklyAverage = 0f;
                System.out.println("\nTemperatures for the entire week:");
                for (int i = 0; i < dailyTemps.size(); i++) {
                    System.out.println(dailyTemps.getDay(i) + ": " + dailyTemps.getTemp(i));
                    weeklyAverage += dailyTemps.getTemp(i);
                }
                float average = weeklyAverage / dailyTemps.size();
                System.out.println("Weekly Average: " + average);
            } else {
                System.out.println(
                    dailyTemps.getDay(dayIndex) + " - " + dailyTemps.getTemp(dayIndex)
                );
            }
        }
    }

    class DailyTemperature {
        private List<String> daysOfTheWeek;
        private List<Float> dailyAvgTemps;

        public DailyTemperature() {
            daysOfTheWeek = new ArrayList<>();
            dailyAvgTemps = new ArrayList<>();

            daysOfTheWeek.add("Sunday");
            daysOfTheWeek.add("Monday");
            daysOfTheWeek.add("Tuesday");
            daysOfTheWeek.add("Wednesday");
            daysOfTheWeek.add("Thursday");
            daysOfTheWeek.add("Friday");
            daysOfTheWeek.add("Saturday");

            dailyAvgTemps.add(32.1f);
            dailyAvgTemps.add(35.7f);
            dailyAvgTemps.add(41.3f);
            dailyAvgTemps.add(45.9f);
            dailyAvgTemps.add(48.2f);
            dailyAvgTemps.add(52.4f);
            dailyAvgTemps.add(59.1f);
        }

        public String getDay(int index) {
            return daysOfTheWeek.get(index);
        }

        public float getTemp(int index) {
            return dailyAvgTemps.get(index);
        }

        public int size() {
            return daysOfTheWeek.size();
        }
    }
}

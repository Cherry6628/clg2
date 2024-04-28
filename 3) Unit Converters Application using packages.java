import java.util.Scanner;

public class Currency {
    public static double convertEUROtoINR(double EURO) {
        return EURO * 80;
    }

    public static double convertDOLLARtoINR(double DOLLAR) {
        return DOLLAR * 66.89;
    }

    public static double convertYENtoINR(double YEN) {
        return YEN * 0.61;
    }

    public static double convertINRtoEURO(double INR) {
        return INR * 0.013;
    }

    public static double convertINRtoDOLLAR(double INR) {
        return INR * 0.015;
    }

    public static double convertINRtoYEN(double INR) {
        return INR * 1.63;
    }

    public static void userChoice() {
        Scanner input = new Scanner(System.in);
        int currency_choice = 0;
        double money = 0;
        while (currency_choice != 7) {
            System.out.println("\nCurrency Converter");
            System.out.println(" ------------------");
            System.out.println("1. DOLLAR to INR\n2. EURO to INR\n3. YEN to INR\n" +
                    "4. INR to DOLLAR\n5. INR to EURO\n6. INR to YEN\n" +
                    "7. Exit\n\nEnter Your Choice");
            currency_choice = input.nextInt();
            switch (currency_choice) {
                case 1:
                    System.out.println("Enter in DOLLAR");
                    money = input.nextDouble();
                    System.out.println(money + " DOLLAR is equal to " + Currency.convertDOLLARtoINR(money) + " INR");
                    break;
                case 2:
                    System.out.println("Enter in EURO");
                    money = input.nextDouble();
                    System.out.println(money + " EURO is equal to " + Currency.convertEUROtoINR(money) + " INR");
                    break;
                case 3:
                    System.out.println("Enter in YEN");
                    money = input.nextDouble();
                    System.out.println(money + " YEN is equal to " + Currency.convertYENtoINR(money) + " INR");
                    break;
                case 4:
                    System.out.println("Enter in INR");
                    money = input.nextDouble();
                    System.out.println(money + " INR is equal to " + Currency.convertINRtoDOLLAR(money) + " DOLLARS");
                    break;
                case 5:
                    System.out.println("Enter in INR");
                    money = input.nextDouble();
                    System.out.println(money + " INR is equal to " + Currency.convertINRtoEURO(money) + " EURO");
                    break;
                case 6:
                    System.out.println("Enter in INR");
                    money = input.nextDouble();
                    System.out.println(money + " INR is equal to " + Currency.convertINRtoYEN(money) + " YEN");
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Please choose a valid option");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        userChoice();
    }
}
************************************************************************************************************************************************************************
import java.util.Scanner;

public class Distance {
    public static double convertMeterToKiloMeter(double meter) {
        return meter / 1000;
    }

    public static double convertMilesToKiloMeter(double miles) {
        return miles * 1.60934;
    }

    public static double convertKiloMetertoMeter(double kilometer) {
        return kilometer * 1000;
    }

    public static double convertKiloMeterToMiles(double kilometer) {
        return kilometer / 1.60934;
    }

    public static void userChoice() {
        Scanner input = new Scanner(System.in);
        int distance_choice = 0;
        double distance = 0;
        while (distance_choice != 5) {
            System.out.println("\nDistance Converter");
            System.out.println(" ----------------- ");
            System.out.println("1. METER to KILOMETER\n2. MILES to KILOMETER\n" +
                    "3. KILOMETER to METER\n4. KILOMETER to MILES\n" +
                    "5. Exit\n\nEnter Your Choice");
            distance_choice = input.nextInt();
            switch (distance_choice) {
                case 1:
                    System.out.println("Enter in METERS");
                    distance = input.nextDouble();
                    System.out.println(distance + " METERS is equal to " + Distance.convertMeterToKiloMeter(distance) + " KILOMETER");
                    break;
                case 2:
                    System.out.println("Enter in MILES");
                    distance = input.nextDouble();
                    System.out.println(distance + " MILES is equal to " + Distance.convertMilesToKiloMeter(distance) + " KILOMETER");
                    break;
                case 3:
                    System.out.println("Enter in KILOMETER");
                    distance = input.nextDouble();
                    System.out.println(distance + " KILOMETER is equal to " + Distance.convertKiloMetertoMeter(distance) + " METER");
                    break;
                case 4:
                    System.out.println("Enter in KILOMETER");
                    distance = input.nextDouble();
                    System.out.println(distance + " KILOMETER is equal to " + Distance.convertKiloMeterToMiles(distance) + " MILES");
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Please choose a valid option");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        userChoice();
    }
}
***********************************************************************************************************************************************************************
import java.util.Scanner;

public class Time {
    public static double convertHoursToMinutes(double hours) {
        return hours * 60;
    }

    public static double convertHoursToSeconds(double hours) {
        return hours * 60 * 60;
    }

    public static double convertMinutesToHours(double minutes) {
        return minutes / 60;
    }

    public static double convertSecondsToHours(double seconds) {
        return seconds / 60 / 60;
    }

    public static void userChoice() {
        Scanner input = new Scanner(System.in);
        int time_choice = 0;
        double time = 0;
        while (time_choice != 5) {
            System.out.println("\nTime Converter");
            System.out.println(" ---------------- ");
            System.out.println("1. HOURS to MINUTES\n2. HOURS to SECONDS\n" +
                    "3. MINUTES to HOURS\n4. SECONDS to HOURS\n" +
                    "5. Exit\n\nEnter Your Choice");
            time_choice = input.nextInt();
            switch (time_choice) {
                case 1:
                    System.out.println("Enter in HOURS");
                    time = input.nextDouble();
                    System.out.println(time + " HOURS is equal to " + Time.convertHoursToMinutes(time) + " MINUTES");
                    break;
                case 2:
                    System.out.println("Enter in HOURS");
                    time = input.nextDouble();
                    System.out.println(time + " HOURS is equal to " + Time.convertHoursToSeconds(time) + " SECONDS");
                    break;
                case 3:
                    System.out.println("Enter in MINUTES");
                    time = input.nextDouble();
                    System.out.println(time + " MINUTES is equal to " + Time.convertMinutesToHours(time) + " HOURS");
                    break;
                case 4:
                    System.out.println("Enter in SECONDS");
                    time = input.nextDouble();
                    System.out.println(time + " SECONDS is equal to " + Time.convertSecondsToHours(time) + " HOURS");
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Please choose a valid option");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        userChoice();
    }
}
***********************************************************************************************************************************************************************
import com.Converters.Currency;
import com.Converters.Distance;
import com.Converters.Time;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        while (choice != 4) {
            System.out.println("Converters");
            System.out.println("**********");
            System.out.println("1. Currency\n2. Distance\n3. Time\n4. Exit\n\nEnter Your Choice");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    Currency.userChoice();
                    break;
                case 2:
                    Distance.userChoice();
                    break;
                case 3:
                    Time.userChoice();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Please choose a valid option");
                    break;
            }
        }
        System.out.println("Thank You !!!!");
    }
}

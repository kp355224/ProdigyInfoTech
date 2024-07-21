import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double temperature;
        
        do {
            System.out.println("Temperature Converter Menu:");
            System.out.println("1. Convert Celsius to Fahrenheit");
            System.out.println("2. Convert Fahrenheit to Celsius");
            System.out.println("3. Convert Celsius to Kelvin");
            System.out.println("4. Convert Kelvin to Celsius");
            System.out.println("5. Convert Fahrenheit to Kelvin");
            System.out.println("6. Convert Kelvin to Fahrenheit");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter temperature in Celsius: ");
                    temperature = scanner.nextDouble();
                    System.out.println("Temperature in Fahrenheit: " + celsiusToFahrenheit(temperature));
                    break;
                case 2:
                    System.out.print("Enter temperature in Fahrenheit: ");
                    temperature = scanner.nextDouble();
                    System.out.println("Temperature in Celsius: " + fahrenheitToCelsius(temperature));
                    break;
                case 3:
                    System.out.print("Enter temperature in Celsius: ");
                    temperature = scanner.nextDouble();
                    System.out.println("Temperature in Kelvin: " + celsiusToKelvin(temperature));
                    break;
                case 4:
                    System.out.print("Enter temperature in Kelvin: ");
                    temperature = scanner.nextDouble();
                    System.out.println("Temperature in Celsius: " + kelvinToCelsius(temperature));
                    break;
                case 5:
                    System.out.print("Enter temperature in Fahrenheit: ");
                    temperature = scanner.nextDouble();
                    System.out.println("Temperature in Kelvin: " + fahrenheitToKelvin(temperature));
                    break;
                case 6:
                    System.out.print("Enter temperature in Kelvin: ");
                    temperature = scanner.nextDouble();
                    System.out.println("Temperature in Fahrenheit: " + kelvinToFahrenheit(temperature));
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            System.out.println();
        } while (choice != 0);

        scanner.close();
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5/9 + 273.15;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9/5 + 32;
    }
}

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double f = sc.nextDouble();

        double c = (5.0 / 9.0) * (f - 32);

        System.out.println("Temperature in Celsius = " + c);

        sc.close();
    }
}
    


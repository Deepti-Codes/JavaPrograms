import java.util.Scanner;

public class Area {

    double a, b, c, s, area;
    Scanner sc = new Scanner(System.in);

    void input() {
        System.out.print("Enter length of first side of triangle: ");
        a = sc.nextDouble();

        System.out.print("Enter length of second side of triangle: ");
        b = sc.nextDouble();

        System.out.print("Enter length of third side of triangle: ");
        c = sc.nextDouble();
    }

    void calculate() {
        if ((a + b > c) && (a + c > b) && (b + c > a)) {

            s = (a + b + c) / 2;

            area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

            System.out.println("Area of Triangle = " + area);
        } else {
            System.out.println("Input is not valid");
        }
    }

    public static void main(String[] args) {

        Area obj = new Area();

        obj.input();
        obj.calculate();
    }
}
    


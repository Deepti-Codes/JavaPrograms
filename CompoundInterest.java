import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double p, r, t, amount, ci;

        System.out.print("Enter Principal Amount: ");
        p = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        r = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        t = sc.nextDouble();

        amount = p * Math.pow((1 + r / 100), t);
        ci = amount - p;

        System.out.println("Amount = " + amount);
        System.out.println("Compound Interest = " + ci);

        sc.close();
    }
}

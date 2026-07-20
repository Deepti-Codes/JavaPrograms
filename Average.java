import java.util.Scanner;

class Average
{
    int a, b;
    double avg;

    Scanner sc = new Scanner(System.in);

    void getdetails()
    {
        System.out.println("Enter first number:");
        a = sc.nextInt();

        System.out.println("Enter second number:");
        b = sc.nextInt();
    }

    void average()
    {
        avg = (a + b) / 2.0;
        System.out.println("Average = " + avg);
    }

    public static void main(String[] args)
    {
        Average averg = new Average();

        averg.getdetails();
        averg.average();
    }
} 
    


import java.util.Scanner;
class Calculator {
    int a,b,sum,product;
    Scanner sc = new Scanner(System.in);

    void input(){
        System.out.println("Enter first number:");
        a= sc.nextInt();
        System.out.println("Enter second number:");
          b= sc.nextInt();
    }

    public void addTwoNo(){
        sum = a+b;
        System.out.println("Sum = " +sum);
    }

    public void prodTwoNo(){
        product = a*b;
        System.out.println("Product = "+product);
    }

    public static void main(String args[]){
        Calculator calc = new Calculator();

        calc.input();
        calc.addTwoNo();
        calc.prodTwoNo();


    }

    
}

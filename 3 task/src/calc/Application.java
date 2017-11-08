package calc;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        char operator;
        int err = 0;

        System.out.println("Enter Number: ");
        num1=input.nextInt();

        System.out.println("Enter Number: ");
        num2=input.nextInt();

        System.out.println("Enter the operator: +,-,*,/");
        operator=input.next().charAt(0);

        do
        {
            err=0;
            switch(operator)
            {
                case '+':
                {
                    add(num1, num2);
                    break;
                }
                case '-':
                {
                    subtract(num1, num2);
                    break;
                }
                case '*':
                {
                    multiply(num1, num2);
                    break;
                }
                case '/':
                {
                    divide(num1, num2);
                    break;
                }
                default:
                {
                    System.out.println("Please enter the operator: +,-,*,/: ");
                    operator=input.next().charAt(0);
                    err=1;
                }
            }
        }while(err==1);
    }

    public static void add(int num1, int num2)
    {
        System.out.println("Sum: "+(num1+num2));
    }
    public static void subtract(int num1, int num2)
    {
        System.out.println("Diff: "+(num1-num2));
    }
    public static void multiply(int num1, int num2)
    {
        System.out.println("Mult: "+(num1*num2));
    }
    public static void divide(int num1, int num2)
    {
        System.out.println("Divide: "+(num1/num2));
    }
}


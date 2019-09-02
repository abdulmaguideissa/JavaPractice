/***************************************************************************
 * File name:   PackageTest.java
 * Description: Testing the intro package using simple examples
 * Author:      Abdulmaguid Eissa
 *****************************************************************************/
import algorithm.Factorial;
import algorithm.Fibonacci;
import java.util.Scanner;

public class PackageTest {
    public static void main(String[] args)
    {
        Factorial factorial = new Factorial();
        Fibonacci fibonacci = new Fibonacci();
        Scanner in = new Scanner(System.in);
        int user_choice = 0;

        System.out.println("Testing the new implemented package ");

        while(true)
        {
            switch (user_choice) {
                case 0:         // Initial state
                    System.out.println("Choose an operation\n(1) Fibonacci\n(2) Factorial\n(3) Exit");
                    user_choice = in.nextInt();
                    break;
                case 1:
                    System.out.println("Enter a number: ");
                    int fibo_num = in.nextInt();
                    System.out.println("Fibo is: " + fibonacci.fibonacci_fast(fibo_num));
                    System.out.println("Choose an operation\n(1) Continue\n(2) Jump to the main menu");
                    switch (in.nextInt())
                    {
                        case 1:
                            break;
                        case 2:
                            user_choice = 0;
                            break;
                        default:
                             user_choice = 0;
                             break;
                    }
                    break;
                case 2:
                    System.out.println("Enter a number: ");
                    int fact_num = in.nextInt();
                    System.out.println("factorial is: " + factorial.factorial_fast(fact_num));
                    System.out.println("(1) Continue\n(2) Jump to the main menu");
                    switch (in.nextInt())
                    {
                        case 1:
                            break;
                        case 2:
                            user_choice = 0;
                            break;
                        default:
                            user_choice = 0;
                            break;
                    }
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Invalid input");
                    user_choice = 0;
                    break;
            }
        }
    }
}

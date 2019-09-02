/***************************************************************************
 * File name:   Factorial.java
 * Description: Introduction to packages, creating algorithms package with
 *              multiple class files, each class implements a well known algorithm
 *              such as fibonacci series, greatest common divisor, factorial, ..
 * Author:      Abdulmaguid Eissa
 *****************************************************************************/
package algorithm;

public class Factorial {
    // Check if the number is positive
    private boolean positive(int num)
    {
        return (num > 0);
    }

    // Calculate the number absolute
    private int abs(int num)
    {
        return ((num > 0) ? num : -1 * num);
    }

    // Calculate using recursion, to be edited
    public int factorial_recusive(int num)
    {
        if (num > 1)
        {
            return (num * factorial_recusive(num - 1));
        }
        return 1;
    }

    // Calculate using looping
    // Supports positive and negative values
    public int factorial_fast(int num)
    {
        int num_abs = abs(num);
        int factorial = 1;

        if (num_abs == 1 || num_abs == 0)
        {
            return (positive(num) ? num_abs : -1 * num_abs);
        }
        while (num_abs > 0)
        {
            factorial = factorial * num_abs;
            num_abs = num_abs - 1;
        }
        return (positive(num) ? factorial : -1 * factorial);
    }
}

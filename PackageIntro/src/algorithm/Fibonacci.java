/***************************************************************************
* File name:   Fibonacci.java
* Description: Introduction to packages, creating algorithms package with
*              multiple class files, each class implements a well known algorithm
*              such as fibonacci series, greatest common divisor, factorial, ..
* Author:      Abdulmaguid Eissa
*****************************************************************************/
package algorithm;

public class Fibonacci {
    // Calculate using recursion
    public int fibonacci_recursive(int fib_num)
    {
        if (fib_num <= 1)
        {
            return fib_num;
        }
        return (fibonacci_recursive(fib_num - 1) + fibonacci_recursive(fib_num - 2));
    }

    // Calculate using dynamic programming
    public int fibonacci_fast(int fib_num)
    {
        int[] f = new int[fib_num];
        int f_index;

        f[0] = 0;
        f[1] = 1;

        for (f_index = 2; f_index < fib_num; f_index++)
        {
            f[f_index] = f[f_index - 1] + f[f_index - 2];
        }
        return f[fib_num - 1];
    }
}

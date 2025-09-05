#include <stdio.h>

int findSum();                                              // function declaration
void main()
{
    int result = findSum();                                    // function call
    printf("%d", result);
    
}

int findSum()                                                  // function definition
{
    int a, sum = 0;
    for (a = 1; a <= 5; a++)
    {
        sum = sum + a;
    }
    return sum;                                              // return the final sum
}


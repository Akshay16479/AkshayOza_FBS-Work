#include <stdio.h>

// Function declaration
int factorial(int );

void main()
{
    int num = 5;

    // Function call
    int fact = factorial(num);
    printf("%d", fact);
}

// Function definition
int factorial(int num)
{
    int i = 1;
    int fact = 1;

    for (num; i <= num; i++)
    {
        fact = fact * i;
    }

    return fact;
}


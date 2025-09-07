#include <stdio.h>

// Function declaration
int sumDigit(int );

void main()
{
    int num = 12345;

    // Function call
    int sum = sumDigit(num);
    printf("%d", sum);
}

// Function definition
int sumDigit(int num)
{
    int last_digit, first_digit, sum = 0;

    last_digit = num % 10;

    for (num; num >= 10;)
    {
        num = num / 10;
    }

    first_digit = num;
    sum = last_digit + first_digit;

    return sum;
}


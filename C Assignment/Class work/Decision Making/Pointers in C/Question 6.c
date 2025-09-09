#include <stdio.h>

// Function declaration
void sumDigit(int *num);

void main()
{
    int num = 12345;

    // Function call
    sumDigit(&num);
}

// Function definition
void sumDigit(int *num)
{
    int last_digit, first_digit, sum = 0;

    last_digit = *num % 10;

    for (*num; *num >= 10;)
    {
        *num = *num / 10;
    }

    first_digit = *num;
    sum = last_digit + first_digit;

    printf("%d", sum);
}


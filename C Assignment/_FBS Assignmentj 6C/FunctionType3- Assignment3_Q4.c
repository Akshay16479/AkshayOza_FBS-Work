#include <stdio.h>

// Function declaration
void sumRange(int , int );

void main()
{
    int num = 1;

    // Function call
    sumRange(num, 5);
}

// Function definition
void sumRange(int num, int end)
{
    int sum = 0;

    while (num <= end)
    {
        sum = sum + num;
        num++;
    }

    printf("%d", sum);
}


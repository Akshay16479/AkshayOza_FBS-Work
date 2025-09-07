#include <stdio.h>

// Function declaration
int sumRange(int , int );

void main()
{
    int num = 1;

    // Function call
    int sum = sumRange(num, 5);
    printf("%d", sum);
}

// Function definition
int sumRange(int num, int constant )
{
    int sum = 0;

    while (num <= constant)
    {
        sum = sum + num;
        num++;
    }

    return sum;
}


#include <stdio.h>

// Function declaration
int avg(int n1, int n2, int n3, int n4, int n5);

void main()
{
    int num1 = 41, num2 = 8, num3 = 12, num4 = 5, num5 = 13;

    // Function call
    int res = avg(num1, num2, num3, num4, num5);

    printf("Average is %d", res);
}

// Function definition
int avg(int n1, int n2, int n3, int n4, int n5)
{
    int average = (n1 + n2 + n3 + n4 + n5) / 5;
    return average;
}


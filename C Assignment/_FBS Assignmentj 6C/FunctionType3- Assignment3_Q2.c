#include <stdio.h>

// Function declaration
void table(int );

void main()
{
    int num = 5;

    // Function call
    table(num);
}

// Function definition
void table(int num)
{
    int a = 1;

    while (a <= 10)
    {
        printf("%d\n",  num * a);
        a++;
    }
}


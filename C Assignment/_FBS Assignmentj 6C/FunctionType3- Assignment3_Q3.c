#include <stdio.h>

// Function declaration
void printNum(int );

void main()
{
    int num = 1;

    // Function call
    printNum(num);
}

// Function definition
void printNum(int num)
{
    while (num <= 10)
    {
        printf("%d\n", num);
        num++;
    }
}


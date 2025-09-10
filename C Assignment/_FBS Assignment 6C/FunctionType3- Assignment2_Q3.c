#include <stdio.h>

// Function declaration
void greatest(int a, int b, int c);

void main()
{
    int a = 50, b = 20, c = 30;

    // Function call
    greatest(a, b, c);
}

// Function definition
void greatest(int a, int b, int c)
{
    if (a > b && a > c)
        printf("Greatest is %d\n", a);
    else if (b > c)
        printf("Greatest is %d\n", b);
    else
        printf("Greatest is %d\n", c);
}


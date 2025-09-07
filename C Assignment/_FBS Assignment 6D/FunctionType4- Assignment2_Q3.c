#include <stdio.h>

// Function declaration
int greatest(int , int , int );

void main()
{
    int a = 50, b = 20, c = 30;

    // Function call
    int res = greatest(a, b, c);
    printf("Greatest is %d\n", res);
}

// Function definition
int greatest(int a, int b, int c)
{
    if (a > b && a > c)
        return a;
    else if (b > c)
        return b;
    else
        return c;
}


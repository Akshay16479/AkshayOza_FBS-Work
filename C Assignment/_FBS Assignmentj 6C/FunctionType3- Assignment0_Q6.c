#include <stdio.h>

// Function declaration
void calc(int);

void main()
{
    int a = 4;

    // Function call
    calc(a);
}

// Function definition
void calc(int a)
{

    int square = a * a;
    int cube   = a * a * a;

    printf("Square is %d and Cube is %d", square, cube);
}


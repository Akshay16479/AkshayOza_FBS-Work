#include <stdio.h>

// Function declarations
int square(int a);
int cube(int a);

void main()
{
    int a = 4;

    int s = square(a);   // call square function
    int c = cube(a);     // call cube function

    printf("Square is %d and Cube is %d\n", s, c);
}

// Function definition for square
int square(int a)
{
    return a * a;
}

// Function definition for cube
int cube(int a)
{
    return a * a * a;
}


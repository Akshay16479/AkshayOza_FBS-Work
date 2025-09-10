#include <stdio.h>

// Function declaration
void swap(int, int);

void main()
{
    int a = 5, b = 8;
    swap(a, b);                              // function call
}


void swap(int a, int b)                     // Function definition
{
    int temp;
    temp = a;
    a = b;
    b = temp;

    printf("Swapping is %d and %d", a, b);
}


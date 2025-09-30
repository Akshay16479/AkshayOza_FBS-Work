#include<stdio.h>

struct Complex
{
    float real;
    float imaginary;
};

void main()
{
    struct Complex c1;
    
    c1.real = 5.5;
    c1.imaginary = 3.2;
    
    printf("Complex Number = %.2f + %.2fi", c1.real, c1.imaginary);
}

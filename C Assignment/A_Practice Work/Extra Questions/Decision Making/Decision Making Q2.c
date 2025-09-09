#include <stdio.h>
#include <math.h>
   
void main()
{
    int a = 1, b = -3, c = 2;
    int d = b*b - 4*a*c;
    int root1, root2,real,imag;

    if (d > 0)   // condition for distinct real roots
    {
        root1 = (-b + sqrt(d)) / (2 * a);
        root2 = (-b - sqrt(d)) / (2 * a);
        printf("Roots are real and distinct: %d,%d\n", root1, root2);
    }
    else if (d == 0)   // condition for equal roots
    {
        root1 = -b / (2 * a);
        printf("Roots are real and equal: %d,%d\n", root1, root1);
    }
    else   // d < 0 ? complex
    {
        real = -b / (2 * a);
        imag = sqrt(-d) / (2 * a);
        printf("Roots are complex: %d + %d\n", real, imag);
    }
}


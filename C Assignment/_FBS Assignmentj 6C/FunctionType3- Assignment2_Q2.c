#include <stdio.h>

// Function declaration
void check(int , int , int );

void main()
{
    int a, b, c;

    printf("Enter three sides of a triangle: ");
    scanf("%d%d%d", &a, &b, &c);

    // Function call
    check(a, b, c);
}

// Function definition
void check(int a, int b, int c)
{
    if (a == b && b == c)
    {
        printf("Triangle is Equilateral Triangle");
    }
    else if (a == b && b != c || b == c && c != a || a == c && c != b)
    {
        printf("Triangle is Isosceles Triangle");
    }
    else
    {
        printf("Triangle is Scalene Triangle");
    }
}


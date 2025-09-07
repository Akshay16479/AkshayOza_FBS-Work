#include <stdio.h>

// Function declaration
int check(int, int, int);

void main()
{
    int a, b, c;

    printf("Enter three sides of a triangle: ");
    scanf("%d%d%d", &a, &b, &c);

    // Function call
    int res = check(a, b, c);

    if(res == 1)
        printf("Triangle is Equilateral Triangle");
    else if(res == 2)
        printf("Triangle is Isosceles Triangle");
    else
        printf("Triangle is Scalene Triangle");
}

// Function definition
int check(int a, int b, int c)
{
    if (a == b && b == c)
        return 1; // Equilateral
    else if ((a == b && b != c) || (b == c && c != a) || (a == c && c != b))
        return 2; // Isosceles
    else
        return 3; // Scalene
}


#include <stdio.h>
int add(),sub(),multi(),divide(),mod();                           // Function declarations

void main()
{
    printf("Addition is %d\n", add());
    printf("Subtraction is %d\n", sub());
    printf("Multiplication is %d\n", multi());
    printf("Division is %d\n", divide());
    printf("Mod is %d\n", mod());
}

 
int add()                                                      // Function definitions
{
    int a, b;
    printf("\nEnter two numbers for Addition: ");
    scanf("%d%d", &a, &b);
    return a + b;
}

int sub()
{
    int a, b;
    printf("\nEnter two numbers for Subtraction: ");
    scanf("%d%d", &a, &b);
    return a - b;
}

int multi()
{
    int a, b;
    printf("\nEnter two numbers for Multiplication: ");
    scanf("%d%d", &a, &b);
    return a * b;
}

int divide()
{
    int a, b;
    printf("\nEnter two numbers for Division: ");
    scanf("%d%d", &a, &b);
    return a / b;  
}

int mod()
{
    int a, b;
    printf("\nEnter two numbers for Modulus: ");
    scanf("%d%d", &a, &b);
    return a % b;
}


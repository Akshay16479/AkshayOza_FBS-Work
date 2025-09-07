#include <stdio.h>

// Function declarations
int add(int, int);
int subs(int, int);
int multi(int, int);
int divi(int, int);
int mod(int, int);

void main()
{
    int Num1, Num2;

    printf("Enter Two Numbers: ");
    scanf("%d%d", &Num1, &Num2);

    int sum = add(Num1, Num2);
    printf("Addition = %d\n", sum);
    int difference = subs(Num1, Num2);
    printf("Subtraction = %d\n", difference);
    int product = multi(Num1, Num2);
    printf("Multiplication = %d\n", product);
    int quotient = divi(Num1, Num2);
    printf("Division = %d\n", quotient);
    int remainder = mod(Num1, Num2);
    printf("Modulus = %d\n", remainder);

    
}

int add(int Num1, int Num2)
{
    return Num1 + Num2;
}

int subs(int Num1, int Num2)
 {
 return Num1 - Num2;
}

int multi(int Num1, int Num2)
{
    return Num1 * Num2;
}

int divi(int Num1, int Num2)
{
    return Num1 / Num2;
}

int mod(int Num1, int Num2)
{
    return Num1 % Num2;
}


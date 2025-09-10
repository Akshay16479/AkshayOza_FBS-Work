#include <stdio.h>

// Function declarations
void add(int*, int*);
void subs(int*, int*);
void multi(int*, int*);
void divi(int*, int*);
void mod(int*, int*);

void main()
{
    int Num1, Num2;

    printf("Enter Two Numbers: ");
    scanf("%d%d", &Num1, &Num2);

    add(&Num1, &Num2);
    subs(&Num1, &Num2);
    multi(&Num1, &Num2);
    divi(&Num1, &Num2);
    mod(&Num1, &Num2);
}

void add(int *Num1, int* Num2)
{
    int sum = *Num1 + *Num2;
    printf("Addition = %d\n", sum);
}

void subs(int *Num1, int* Num2)
{
    int sub = *Num1 - *Num2;
    printf("Subtraction = %d\n", sub);
}

void multi(int *Num1, int* Num2)
{
    int mul = *Num1 * *Num2;
    printf("Multiplication = %d\n", mul);
}

void divi(int *Num1, int* Num2)
{
        int div = *Num1 / *Num2;
        printf("Division = %d\n", div);
    
}

void mod(int *Num1, int* Num2)
{
    
     int m = *Num1 % *Num2;
        printf("Modulus = %d\n", m);
}


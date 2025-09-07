#include <stdio.h>

// Function declaration
void check(int age);

void main()
{
    int age;
    printf("Enter Age: ");
    scanf("%d", &age);

    // Function call
    check(age);
}

// Function definition
void check(int age)
{
    if (age < 12)
        printf("Child");
    else if (age >= 12 && age <= 19)
        printf("Teenager");
    else if (age >= 20 && age <= 59)
        printf("Adult");
    else
        printf("Senior");
}


#include <stdio.h>

// Function declaration
int check(int);

void main()
{
    int age;
    printf("Enter Age: ");
    scanf("%d", &age);

    // Function call
    int res = check(age);

    if(res == 1)
        printf("Child");
    else if(res == 2)
        printf("Teenager");
    else if(res == 3)
        printf("Adult");
    else
        printf("Senior");
}

// Function definition
int check(int age)
{
    if (age < 12)
        return 1;   // Child
    else if (age >= 12 && age <= 19)
        return 2;   // Teenager
    else if (age >= 20 && age <= 59)
        return 3;   // Adult
    else
        return 4;   // Senior
}


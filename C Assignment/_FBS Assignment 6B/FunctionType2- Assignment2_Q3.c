#include <stdio.h>

int checkAgeCategory();   // function declaration

void main()
{
    int result;

    result = checkAgeCategory();   // function call

    if (result == 1)
        printf("Child");
    else if (result == 2)
        printf("Teenager");
    else if (result == 3)
        printf("Adult");
    else
        printf("Senior");
}

int checkAgeCategory()   // function definition
{
    int age;
    printf("Enter age: ");
    scanf("%d", &age);

    if (age < 12)
        return 1;
    else if (age >= 12 && age <= 19)
        return 2;
    else if (age >= 20 && age <= 59)
        return 3;
    else
        return 4;
}


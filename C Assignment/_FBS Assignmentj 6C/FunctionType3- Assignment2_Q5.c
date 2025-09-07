#include <stdio.h>

// Function declaration
void check(int);

void main()
{
    int mark;

    printf("Enter Mark: ");
    scanf("%d", &mark);

    // Function call
    check(mark);
}

// Function definition
void check(int mark)
{
    if (mark > 75)
    {
        printf("Distinction");
    }
    else if (mark > 65)
    {
        printf("First Class");
    }
    else if (mark > 55)
    {
        printf("Second Class");
    }
    else if (mark >= 40)
    {
        printf("Pass Class");
    }
    else
    {
        printf("Fail");
    }
}



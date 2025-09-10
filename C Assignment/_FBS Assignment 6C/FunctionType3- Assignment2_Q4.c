#include <stdio.h>

// Function declaration
int check(int age);

void main()
{
    int age;
    printf("Enter Age: ");
    scanf("%d", &age);

    // Function call
    int res=check(age);
    if (res==1)
    {
    printf("Child");
	}
}

// Function definition
int check(int age)
{
    if (age < 12)
        return 1;
    else if (age >= 12 && age <= 19)
        return 2;
   else if (age >= 20 && age <= 59)
 return 3;
    else
        return 4;
}


#include <stdio.h>

// Function declaration
void calc(int , char );

void main()
{
    int price;
    char student;

    printf("Enter the price of purchased items: ");
    scanf("%d", &price);

    printf("Are you a student? (y/n): ");
    scanf(" %c", &student);  

    // Function call
    calc(price, student);
}

// Function definition
void calc(int price, char student)
{
    float discount = 0.0, final_amount;

    if (student == 'y' || student == 'Y')
    {
        if (price > 500)
            discount = 0.20 * price;
        else
            discount = 0.10 * price;
    }
    else
    {
        if (price > 600)
            discount = 0.15 * price;
        else
            discount = 0.0;
    }

    final_amount = price - discount;
    printf("Final Amount = %f", final_amount);
}


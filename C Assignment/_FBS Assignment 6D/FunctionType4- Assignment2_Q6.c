#include <stdio.h>

// Function declaration
float calc(int , char );

void main()
{
    int price;
    char student;

    printf("Enter the price of purchased items: ");
    scanf("%d", &price);

    printf("Are you a student? (y/n): ");
    scanf(" %c", &student);  

    // Function call
    float final_amount = calc(price, student);
    printf("Final Amount = %f", final_amount);
}

// Function definition
float calc(int price, char student)
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
    return final_amount;
}


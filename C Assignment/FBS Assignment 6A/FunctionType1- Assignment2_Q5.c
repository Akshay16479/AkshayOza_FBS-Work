#include <stdio.h>

void calculateDiscount();   // function declaration

void main()
{
    calculateDiscount();    // function call
}

void calculateDiscount()    // function definition
{
    int price;
    char student;
    float discount = 0.0, final_amount;

    printf("Enter the price of purchased items: ");
    scanf("%d", &price);

    printf("Are you a student? (y/n): ");
    scanf(" %c", &student);

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

    printf("%f", final_amount);
}


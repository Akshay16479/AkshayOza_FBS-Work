#include<stdio.h>

struct Product
{
    int id;
    char name[20];
    int quantity;
    float price;
};

void main()
{
    struct Product p1;
    
    printf("Enter product id : ");
    scanf("%d", &p1.id);
    
    printf("Enter product name : ");
    scanf("%s", p1.name);
    
    printf("Enter quantity : ");
    scanf("%d", &p1.quantity);
    
    printf("Enter price : ");
    scanf("%f", &p1.price);
    
    printf("Product Details -> ID = %d , Name = %s , Quantity = %d , Price = %.2f",
           p1.id, p1.name, p1.quantity, p1.price);
}

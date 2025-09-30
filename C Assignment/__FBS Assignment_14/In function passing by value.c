#include<stdio.h>

struct Product
{
    int id;
    char name[20];
    int quantity;
    float price;
};

struct Product store();
void display(struct Product );

void main()
{
    struct Product p1;

    p1 = store();    
    display(p1);    
}
struct Product store()
{
    struct Product p;

    printf("Enter product id : ");
    scanf("%d", &p.id);

    printf("Enter product name : ");
    scanf("%s", p.name);

    printf("Enter quantity : ");
    scanf("%d", &p.quantity);

    printf("Enter price : ");
    scanf("%f", &p.price);

    return p; 
}

void display(struct Product p)
{
    printf("Product Details : ID = %d , Name = %s , Quantity = %d , Price = %.2f\n",
           p.id, p.name, p.quantity, p.price);
}

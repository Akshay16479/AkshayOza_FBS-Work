#include<stdio.h>

struct Product
{
    int id;
    char name[20];
    int quantity;
    int price;
};

void store(struct Product *p);
void display(struct Product *p);

void main()
{
    struct Product p1;

    //  (pass by address)
    store(&p1);

    //  (pass by address)
    display(&p1);
}

// Store product details (pass by address)
void store(struct Product *p)
{
    printf("Enter product id : ");
    scanf("%d", &p->id);

    printf("Enter product name : ");
    scanf("%s", p->name);

    printf("Enter quantity : ");
    scanf("%d", &p->quantity);

    printf("Enter price : ");
    scanf("%d", &p->price);
}

// Display product details (pass by address)
void display(struct Product *p)
{
    printf("Product Details -> ID = %d , Name = %s , Quantity = %d , Price = %d\n",
           p->id, p->name, p->quantity, p->price);
}

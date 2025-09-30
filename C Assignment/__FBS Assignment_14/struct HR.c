#include<stdio.h>
struct HR
{
    int id;
    char name[20];
    int salary;
    int commission;
};

void main()
{
    struct HR hr1;
    
    printf("Enter id : ");
    scanf("%d", &hr1.id);
    
    printf("Enter name : ");
    scanf("%s", hr1.name);
    
    printf("Enter salary : ");
    scanf("%d", &hr1.salary);
    
    printf("Enter commission : ");
    scanf("%d", &hr1.commission);
    
    printf("ID = %d , Name = %s , Salary = %d , Commission = %d",
           hr1.id, hr1.name, hr1.salary, hr1.commission);
}

#include<stdio.h>
struct salesmanager
{
    int id;
    char name[20];
    int salary;
    int incentive;
};

void main()
{
    struct salesmanager sm1;
    sm1.id=101;
    strcpy(sm1.name,"Akshay");
    sm1.salary=25000;
    sm1.incentive=3000;
    printf("ID = %d , Name = %s , Salary = %d , Incentive = %d",
           sm1.id, sm1.name, sm1.salary, sm1.incentive);
}

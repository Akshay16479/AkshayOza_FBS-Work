#include <stdio.h>

struct Employee {
    int id;
    char name[20];
    int salary;
};

void main() {
    struct Employee e1;

    printf("Enter Employee ID: ");
    scanf("%d", &e1.id);

    printf("Enter Employee Name: ");
    scanf("%s", e1.name);

    printf("Enter Employee Salary: ");
    scanf("%d", &e1.salary);

    printf("ID = %d , Name = %s , Salary = %d\n", e1.id, e1.name, e1.salary);

}

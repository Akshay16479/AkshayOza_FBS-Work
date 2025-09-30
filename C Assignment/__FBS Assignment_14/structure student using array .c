#include <stdio.h>

struct student
{
    int id;
    char name[20];
};

int main()
{
    struct student arr[5];
    
    for(int i = 0; i < 5; i++)
    {
        printf("Enter student %d ID and Name: ", i+1);
        scanf("%d %s", &arr[i].id, arr[i].name); 
    }
    
    printf("\nStudent Details:\n");
    for(int i = 0; i < 5; i++)
    {
        printf("id=%d and name=%s\n", arr[i].id, arr[i].name);
    }

    return 0;
}

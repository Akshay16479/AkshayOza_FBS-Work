#include<stdio.h>
struct student
{
	int rollno;
	char name[20];
	int mark;
};

void main()
{
	struct student s1;
	
	printf("Enter roll no :");
	scanf("%d",&s1.rollno);
	printf("Enter name  :");
	scanf("%s",s1.name);
	printf("Enter mark  :");
	scanf("%d",&s1.mark);
	printf("Roll=%d , Name=%s ,Mark=%d ",s1.rollno,s1.name,s1.mark);

	
}
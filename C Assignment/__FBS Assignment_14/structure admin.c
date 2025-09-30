	#include<stdio.h>
	typedef struct admin
	{
		int id;
		char name[20];
		int salary;
		int allowance;
	}admin;
	
	void main()
	{
		 admin ad1;
		
		printf("Enter id :");
		scanf("%d",&ad1.id);
		printf("Enter name  :");
		scanf("%s",ad1.name);
		printf("Enter salary  :");
		scanf("%d",&ad1.salary);
		printf("Enter allowance  :");
		scanf("%d",&ad1.allowance);
		printf("Roll=%d , Name=%s ,Mark=%d ,Allowance=%d ",ad1.id,ad1.name,ad1.salary,ad1.allowance);
	
		
	}
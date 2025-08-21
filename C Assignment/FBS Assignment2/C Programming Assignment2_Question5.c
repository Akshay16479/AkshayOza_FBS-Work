#include <stdio.h>


void main()
{
	int purchased ;
	char student;
	printf("Enter Price of Purchased Items: ");
    scanf("%d", &purchased);

    printf("Are you a student? (y/n): ");
    scanf(" %c", &student);
	
	if(student=='y')
	{
		if(purchased>500)
		{
		printf("Discount Applied 20%");
		}
		else
		{
		printf("Discount Applied 10");
		}
}
		else
		{
			if(student=='n'&& purchased>600)
			{
				printf("Discount Applied 15%");
			}
			else
			{
				printf("No Discount Applicable");
			}
			
			
		}
		
		
	}
	
	
	
	
	
	
	
	


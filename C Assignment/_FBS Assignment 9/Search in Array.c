#include<stdio.h>
void main() 
{
	int arr[5];
	
    store(arr,5);
    display(arr,5);
    search(arr,5);
}

void store(int*arr,int num)
{
	printf("Enter Numbers: ");
	for(int i=0; i<num; i++)
	scanf("%d",&arr[i]);
}

void display(int*arr,int num)
{
	printf("Stored Number in Array are : ");
	for(int i=0;i<num;i++)
	printf("%d\n",arr[i]);	
}

void search(int*arr,int num)
{
	int no;
	int flag=0;
	printf("Enter Number Which You Want To Search");
	scanf("%d",&no);

	for(int i=0; i<num; i++) 
	{
		if(no==arr[i])
			flag=1;
	}
	if(flag==1)
		printf("Number Found in Array");

	else
		printf("Number Not Found in Array");
}


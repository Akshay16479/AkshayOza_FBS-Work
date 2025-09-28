#include<stdio.h>
void main()
{
	char arr[50];
	int n;
	printf("Enter String:");
	scanf("%s",arr);
	
	printf("Enter Index you Want to remove:");
	scanf("%d",&n);
	
	for(int i=n;arr[i]!='\0';i++)
	{
	arr[i]=arr[i+1];
	}
	printf("%s",arr);
}
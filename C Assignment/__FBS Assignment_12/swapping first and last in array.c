#include<stdio.h>
void main()
{
	char temp;
	char arr[50];
	printf("Enter String:");
	scanf("%s",arr);
	
	int res=strlen(arr);
	
	temp=arr[0];
	arr[0]=arr[res-1];
	arr[res-1]=temp;
	
	printf("%s",arr);

}
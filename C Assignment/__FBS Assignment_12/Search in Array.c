#include<stdio.h>
void main()
{
	char ch;
	char arr[50];
	printf("Enter String:");
	scanf("%s",arr);
	
	printf("Enter Character You want to search :");
	scanf(" %c",&ch);
	int flag=0;
	for(int i=0;arr[i]!='\0';i++)
	{
		if(arr[i]==ch)
		flag=1;
		
	}
	if(flag==1)
	printf("Character found in string\n");
	else
	printf("Character not found in string\n");
	
	
	
}
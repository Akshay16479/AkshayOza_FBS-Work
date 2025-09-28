#include<stdio.h>
void main()
{
	char oldChar,newChar;
	char arr[50];
	printf("Enter String:");
	scanf("%s",arr);

    printf("Enter Character You want to replace: ");
    scanf(" %c", &oldChar);

    printf("Enter New Character: ");
    scanf(" %c", &newChar);
    
	int flag=0;
	for(int i=0;arr[i]!='\0';i++)
	{
		if(arr[i]==oldChar)
		{
			arr[i]=newChar;
			flag=1;
		}	
	}
	if(flag==1)
	printf("%s",arr);
	else
	printf("Character not found in string\n");
	
	
	
}
#include<stdio.h>
#include<stdlib.h>
int main()
{
	char str1[] = "hello";
	char str2[] = "hello";
	char *str3 = "hello";
	char *str4 = "hello";
	if (str1 == str2)
	{
		printf("same\n");
	}
	else
	{
		printf("no same\n");
	}
	if (str3 == str4)
	{
		printf("same\n");
	}
	else
	{
		printf("no same\n");
	}
	system("pause");
	return 0;
}
/*double arr[10];
int *p =(int *) &arr[0];
int *q =(int *) &arr[10];
printf("%d", q-p);*/
//unsigned char i = 0;
//
//int main()
//{
//	char a = -1;
//	signed char b = -1;
//	unsigned char c = -1;
//	printf("%d,%u,%d", a, b, c);
//	/*for (i = 0; i <= 255; i++)
//	{
//		printf("hello,bit:%d\n",i);
//	}*/
//	/*unsigned int i;
//	for (i = 9; i >= 0; i--)
//	{
//		printf("%u\n", i);
//	}*/
//	system("pause");
//	return 0;
//}
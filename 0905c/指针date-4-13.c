#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<stdlib.h>
int main()
{
	/*int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
	int  *p = arr;
	int sz = sizeof(arr) / sizeof(arr[0]);
	int i = 0;
	for (i = 0; i < sz; i++)
	{
		printf("%d ", *(p + i));
	}*/
	int n = 0x11223344;
	char*pc = (char*)&n;
	int*pi = &n;
	*pc = 00;
	*pi = 0;
	system("pause");
	return 0;
}
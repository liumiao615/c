#define _CRT_SECURE_NO_WARNINGS 1
//求sn=a+aa+aaa+aaaa+aaaaa的值
//#include<stdio.h>
//#include<stdlib.h>
//#include<math.h>
//
//int main()
//{
//	int i = 0;
//	int j = 0;
//	int a ,sum1=0,sum2= 0;
//	scanf("%d", &a);
//	for (i=0;i<=4;i++)
//	{
//		//j = a + (10 ^ i);
//		j=a*pow(10, i);
//
//		sum1 += j;
//		sum2+= sum1;
//	}
//	printf("%d\n", sum2);
//
//	system("pause");
//	return 0;
//}







//求菱形

//#include<stdlib.h>
//#include<stdio.h>
//int main()
//{
//	int i, j, n;
//	printf("输入行数(正数):");
//	do
//	{
//		scanf("%d", &n);
//	} while (0);
//	/*if (0 == n % 2)
//		n = n - 1;*/
//	for (i = 1; i <= n / 2 + 1; i++)
//	{
//		for (j = 0; j <= n / 2 - i; j++)
//			printf(" ");
//		for (j = 1; j <= i * 2 - 1; j++)
//			printf("*");
//		printf("\n");
//	}
//	for (i = 0; i<n / 2; i++)
//	{
//		for (j = 0; j <= i; j++)
//			printf(" ");
//		for (j = 0; j<n - 2 * (i + 1); j++)
//			printf("*");
//		printf("\n");
//	}
//	system("pause");
//	return 0;
//}



//#include<stdio.h>
//#include<stdlib.h>
//int main()
//{
//	int line = 0;
//	int i = 0;
//
//	scanf("%d", &line);
//	for (i = 0; i < line; i++)
//	{
//		int j = 0;
//
//		for (j = 0; j < line - 1 - i; j++)
//		{
//			printf(" ");
//		}
//		for (j = 0; j < 2 * i + 1; j++)
//		{
//			printf("*");
//		}
//		printf("\n");
//	}
//	for (i = 0; i < line - 1;i++)
//	{
//		 int j = 0;
//		for (j = 0; j <=i; j++)
//		{
//			printf(" ");
//		}
//		for (j = 0; j < 2 * (line-1-i)-1; j++)
//		{
//			printf("*");
//		}
//		printf("\n");
//	}
//	system("pause");
//	return 0;
//}




//求出0～999之间的所有“水仙花数”并输出
//“水仙花数”是指一个三位数，其各位数字的立方和确好等于该数本身，如；153＝1＋5＋3 ? ，则153是一个“水仙花数”。
/*
在数论中，水仙花数（Narcissistic number）也称为自恋数、自幂数、阿姆斯壮数或阿姆斯特朗数（Armstrong number），是指一N位数，其各个数之N次方和等于该数。
例如153、370、371及407就是三位数的水仙花数，其各个数之立方和等于该数：
153 = 1^3 + 5^3 + 3^3。
*/
//#include<math.h>
//#include<stdio.h>
//#include<stdlib.h>
//int main()
//{
//	int i = 0; 
//	int j = 0;
//	int k = 0;	
//	int n = 0;
//	int p = 0;
//	for (i = 100; i < 1000; i++)
//	{
//		j = i / 100;
//		k = i % 100 / 10;
//		n = i % 100 % 10;
//		p= pow(j, 3) + pow(k, 3) + pow(n, 3);
//		if (p == i)
//		printf("%d\n", i);
//	}
//	system("pause");
//	return 0;
//}
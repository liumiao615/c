//字符串+转义字符
//#include <stdio.h>
//#include <stdlib.h>
//#include <string.h>
//int main()
//{
//	//char arr1[] = "abcdefg";
//	//char arr2[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g','\0' };
//	//printf("%s\n", arr1);
//	//printf("%s\n", arr2);
//	//printf("%d\n", strlen("abcdefg"));//"\0"只是结束标志
//	//printf("%d\n", strlen("arr1"));//strlen表示求字符串长度
//	//printf("%d\n", strlen("arr2"));
//	//printf("\a\a\a\a\a\a");
//	//printf("%d\n", strlen("c:\test\328\test.c"));//\32表示八进制的表达所以算作一个字符。
//
//	system("pause");
//	return 0;
//}
//#include <stdio.h>
//#include <stdlib.h>
//int main()
//{
//	int a = 12;
//	int b = 34;
//	int c = a + b;
//	printf("c=%d", c);
//	system("pause");
//	return 0;
//}
//循环语句
#define _CRT_SECURE_NO_WARNINGS
//#include <stdio.h>
//#include <stdlib.h>
//int main()
//{
//	int input = 0;
//	printf("你会好好学习吗？\n");
//		scanf("%d", &input);
//	if (input ==1 )
//	{
//		printf("offer\n");
//	}
//	else
//	{
//		printf("go home\n");
//	}
//	system("pause");
//	return 0;
//}
//while语句
//#include <stdio.h>
//#include <stdlib.h>
//int main()
//{
//	printf("加入比特\n");
//	int line = 0;
//	while (line <= 2000)
//	{
//		printf("敲代码\n");
//		line++;
//	}
//	if (line > 2000) 
//	{
//		printf("offer\n");
//	}
//	system("pause");
//	return 0;
//}
//#include  <stdio.h>
//#include <stdlib.h>
//int main()
//{
//	int line = 0;
//	while  (line < 5)
//	{
//
//		line++;
//		printf("敲代码\n");
//
//	}
//	if (line == 5)//这里的if和while有啥区别？
//	{
//		line++;
//		printf("offer\n");
//
//	}
//	system("pause");
//	return 0;
//}
//#include <stdio.h>
//#include <stdlib.h>
//int main()
//{
//	int i, j;
//	for (i = 1; i < 10; i++)
//	{
//		for (j = 1; j < 10; j++)
//		{
//			if (j < i)
//				printf("");
//				else
//			printf("%d%d= %2d \t", i, j, i*j);
//			//%2d 控制宽度为两个字符，且右对齐；如果改为 %-2d 则为左对齐
//            // \t为tab缩进
//			
//		}
//		printf("\n");
//	}
//
//	system("pause");
//	return 0;
//}

//#include <stdio.h>
//#include <stdlib.h>
//int main()
//{
//	//int a = 3;//011
//	//int b = 5;//101
//	//int c = a^b;//&表示与；|表示或；^为亦或
//	//printf("c=%d\n", c);
//	//int a = 5;
//	//int b=a >>1;//二进制位
//	////5的二进制表示形式101，32个比特位00000000000000000000000000000101
//	//printf("%d\n",b);
//	system("pause");
//	return 0;
//}
//#include<stdio.h>
//#include<stdlib.h>
//int main()
//{
//	int a = 10;
//	int b = a++;//先使用a的值，再++
//	int c = ++b;//先++后使用
//	printf("a=%d\n", a);
//	printf("b=%d\n", b);
//	printf("c=%d\n", c);
//	//printf("%d\n", ~a);//~按位取反
//	//&a;//取出变量内存中的编号;
//	//printf("%p\n", &a);//以十六进制进行打印，%p是打印地址符
//	//printf("%d\n", !a);
//	system("pause");
//	return 0;
//}
//#include<stdio.h>
//#include<stdlib.h>
//int main()
//{
//	int a = 10;
//	int b = 20;
//	int max = 0;
//    a > b ? (max = a) : (max = b);
//	//max = a > b ? a : b;
//	 
//	//if (a > b)
//	//	max = a;
//	//else
//	//	max = b;
//	printf("%d\n", max);
//	//int a = (int)3.14;//强制类型转换
//	system("pause");
//	return 0;
//}
//#include<stdio.h>
//#include<stdlib.h>
//int Add(int x, int y)
//{
//	int c = x + y;
//	printf("c=%d\n", c);
//
//	return c;//return c 返回至 c
//
//}
//int main()
//{
//	int a = 1;
//	int b = 19;
//	int c = 0;
//	c = Add(a, b);//函数调用操作符
//	printf("c=%d\n", c);
//	system("pause");
//	return 0;
//#include<stdio.h>
//#include<stdlib.h>
//extern int g_val;
//int main()
//{
//	printf("%d\n", g_val);
////ypedf类型重定义
////typedef unsigned int num uint;
////test()
////{
////	static int a = 1;//static修饰局部变量，改变了变量的生命周期
////	//生命周期是程序的生命周期，定义域为test函数
////	a++;
////	printf("%d\n", a);
////}
//
////	int i = 0;
////	for (i = 0; i < 10; i++)
////	{
////		test();
////	}
////
//system("pause");
//  return 0;
//}
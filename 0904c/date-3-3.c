//#include <stdio.h>
//#include <stdlib.h>
//int main()
//{
//	printf("C语言");
//	system("pause");
//	return 0;
//}
//#include<stdio.h>
//#include<stdlib.h>
//int main()
//{
//	printf("%d\n", sizeof(char));
//	printf("%d\n", sizeof(long));
//	printf("%d\n", sizeof(long long));
//	printf("%d\n", sizeof(float));
//	printf("%d\n", sizeof(double));
//	printf("%d\n", sizeof(short));
//	printf("%d\n", sizeof(int));
//	system("pause");
//	return  0;
//}
//int main()
//{
//	float weigh = 55.4;
//	char ch = 0;
//	short age=0;
//	printf("%d\n", age);
//	system("pause");
//	return 0;
//}
//#include<stdio.h>
//#include<stdlib.h>//先局部后全局
//void test()
//{
//	int a = 1;
//}
//int a = 188;
//int main()
//{
//	int a = 19;
//	printf("%d\n", a);
//	system("pause");
//	return 0;
//#define _CRT_SECURE_NO_WARNINGS
//#include <stdio.h>
//#include<stdlib.h>
//int main()
//{
//	int num1 = 0;
//	int num2 = 0;
//	int sum = 0;
//	scanf("%d，%d", &num1, &num2);
//	sum = num1 + num2;
//	printf("sum=%d\n", sum );
//	system("pause");
//	return 0;
//
//}
//#include<stdio.h>
//#include<stdlib.h>
//int main()
//{
//	char arr[20] = { 0 };
//	scanf("%s", arr);
//	printf("%s\n", arr);
//	//printf("%s\n", arr);
//	//printf("%d\n", 100);
//	//printf("%f\n", 9.6);
//	system("pause");
//	return 0;
//}
//#include <stdio.h>
//#include <stdlib.h>
//void test()
//{
//	int i = 1;
//	i = i + 1;
//	printf("%d", i);
//}
//int main()
//{
//	int a = 1;
//	for (a = 0; a < 10; a++)
//	{
//		test();
//	}
//	system("pause");
//	return 0;
//}
//全局变量的作用域是整个工程，不仅仅是自己所在的源文件。
//#include <stdio.h>
//#include <stdlib.h>
//int g_val = 2000;//作用于整个程序
////在一个源文件内部重新创一个.c文件，也可以使用，只需要生明一下就行。
////例如：extern int g_val;
//void test()
//{
//	printf("void::g_val=%d\n", g_val);
//}
//int main()
//{
//	test();
//	printf("main::g_val=%d\n", g_val);
//	system("pause");
//	return 0;
//}
//#include <stdio.h>
//#include <stdlib.h>
//int main()
//{
//	conse int n = 19;
//	int arr[10] = { 1 };
//	int arr2[n] = { 0 };
//	//const int num = 2;//num为常变量//conse  只是变量具有了常数性
//	//num = 76;
//	printf("num=%d\n", num);
//	system("pause");
//	return 0;
//}
//#include <stdio.h>
//#include <stdlib.h>
//
//#define MAX 10 //define定义的标识符常量，编译器处理时遇到的max统统处理为10
//int main()
//{
//	int arr[MAX] = { 1 };
//	system("pause");
//	return 0;
//}
//枚举常量
//#include<stdio.h>
//#include<stdlib.h>
//    enum Sex
//	{
//		MALE,//枚举常量
//		FEMALE,//逗号
//		SECERT
//	};
//	int main()
//	{
//		enum Sex sex = FEMALE;
//		printf("%d\n", MALE);//0
//		printf("%d\n", FEMALE);//1
//		printf("%d\n", SECERT);//2
//		//MALE = 5;//常量不能改
//		system("pause");
//			return 0;
//	}
//
#include"three_chess.h"
int main()
{
	int select = 0;
	int quit = 0;
	while (!quit)
	{
		ShowUI();

		scanf("%d", &select);
		switch (select)
		{
		case 1:
			Game();
			break;
		case 2:
			quit = 1;
			printf("byebye\n");
			break;
		default:
			printf("please enter again\n");
			break;
		}
	}
	system("pause");
	return 0;
}










//#include"three_chess.h"
//int main()
//{
//	int select = 0;
//	while (1)
//	{
//		Show_UI();
//		scanf("%d", &select);
//		switch (select)
//		{
//		case 1:
//			Game();
//			break;
//		case 2:
//			return 0;
//			break;
//		default:
//			printf("please enter ture number\n");
//			break;
//		}
//	}
//}
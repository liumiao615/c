//#include"three_chess.h"
//void ShowUI()
//{
//	printf("###########################\n");
//	printf("#1.play#############2.exit#\n");
//	printf("###########################\n");
//	printf("please choose:\n");
//}
//void ComputerMove(char board[][COL], int row, int col)
//{
//	while (1)
//	{
//		int x = rand() % row;
//		int y = rand() % col;
//		if (board[x][y] == ' ')
//		{
//			board[x][y] = 'O';
//			break;
//		}
//	}
//}
//void PlayMove(char board[][COL], int row, int col)
//{
//	int x, y;
//	while (1)
//	{
//		printf("please enter your pos(x,y):");
//		scanf("%d %d", &x,&y);
//		if (x >= 1 && x <= row && y >= 1 && y <= col)
//		{
//			if (board[x -1][y -1] == ' ')
//			{
//				board[x - 1][y - 1] = 'X';
//				break;
//			}
//			else
//			{
//				printf("enter pos is not ok!try again!!!\n");
//			}
//		}
//		else
//		{
//			printf("please enter again\n");
//		}
//	}
//}
//char Judge(char board[][COL], int row, int col)
//{
//	int i = 0;
//	int j = 0;
//	for (i = 0; i < row; i++)
//	{
//		if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && \
//			board[i][0] != ' ')
//		return board[i][0];
//	}
//	for (i = 0; i < col; i++)
//	{
//		if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && \
//			board[0][i] != ' ')
//		return board[0][i];
//	}
//			if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && \
//				board[1][1] != ' ')
//			return board[1][1]; 
//			if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && \
//				board[1][1] != ' ')
//			return board[1][1]; 
//			for (i = 0; i < row; i++)
//			{
//				for (j = 0; j < col; j++)
//				{
//					if (board[i][j] == ' ')
//					{
//						return 'N';
//					}
//				}
//			}
//			return 'E';
//}
//void ShowBoard(char board[][COL], int row, int col)
//{
//	printf("  1 2 3\n");
//	printf("---------\n");
//	int i = 0;
//	int j = 0;
//	for (i = 0; i < row; i++)
//	{
//		printf("%d|", i);
//		for (j=0; j < col; j++)
//		{
//			printf("%c|",board[i][j]);
//		}
//		printf("\n");
//	}
//
//}
//
//void Game()
//{
//	char board[ROW][COL];
//	memset(board, ' ', sizeof(board));
//	char result = 'N';
//	srand((unsigned long)time(NULL));//随机数
//	while (1)
//	{
//		ComputerMove(board, ROW, COL);
//		ShowBoard(board, ROW, COL);
//		result = Judge(board, ROW, COL);
//		if (result != 'N')//{'x''o''e''n'}
//		{
//			break;
//		}
//		PlayMove(board, ROW,COL);
//		ShowBoard(board, ROW,COL);
//		result = Judge(board, ROW, COL);
//		if (result != 'N')//{'x''o''e''n'}
//		{
//			break;
//		}
//	}
//	switch (result)
//	{
//	case 'X':
//		printf("You win!!!\n");
//		break;
//	case'O':
//		printf("You lost\n");
//		break;
//	case'E':
//		printf("平局\n");
//		break;
//	default:
//		break;
//	}
//}
//
//
//
//
//
//
//

//#include"three_chess.h"
//void Show_UI()
//{
//	printf("###############################\n");
//	printf("####1,play###########2,exit####\n");
//	printf("###############################\n");
//	printf("please choose select:\n");
//}
//void Game()
//{
//
//	char Board[ROW][COL];
//	memset(Board, ' ', sizeof(Board));
//	char result = 'N';
//	srand()
//	while (1)
//	{
//		Computer(Board, ROW,COL );
//		Show_board(Board, ROW, COL);
//		result = Judge(Board, ROW, COL);
//	    if (result != 'N')//{'x''o''e''n'继续}
//		{
//			break;
//			    	}
//		Player(Board, ROW, COL);
//		Show_board(Board, ROW, COL);
//		result = Judge(Board, ROW, COL);
//		if (result != 'N')//{'x''o''e''n'}
//		{
//			break;
//		}
//
//	}
//	switch (result)
//	{
//	case 'X':
//		printf("you win!!\n");
//		break;
//	case'O':
//		printf("you lose\n");
//		break;
//	case'E':
//		printf("1:1");
//		break;
//	default:
//		break;
//
//	}
//}

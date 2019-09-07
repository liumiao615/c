#define _CRT_SECURE_NO_WARNINGS 1

#ifndef _THREE_CHESS_H_
#define _THREE_CHESS_H_
#pragma warning(disable:4996)
#include<stdio.h>
#include<windows.h>
#include<time.h>

#define ROW 3
#define COL 3



void ShowUI();
void Game();
void ComputerMove(char board[][COL], int row, int col);
void ShowBoard(char board[][COL],int row, int col);
char Judge(char board[][COL], int row, int col);
void PlayMove(char board[][COL], int row, int col);




#endif




//#ifndef _THREE_CHESS_H_
//#define _THREE_CHESS_H
//#pragma warning(disable:4996)
//#include<stdio.h>
//#include<windows.h>
//#include<time.h>//Ëæ»úÊý
//
//
//
//
//void Show_UI();
//void Game();
//#define ROW 3
//#define COL 3
//
//
//
//
//
//#endif
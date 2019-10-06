/*
 * hausaufgabe.c
 *
 *  Created on: 6 окт. 2019 г.
 *      Author: ilya
 */
#include<stdio.h>

void shape(int n) {
	int i;
	int j;
for(j = 1; j <= n; j++){
	for(i = 1; i <= n; i++)
	{
		if(j == 1 || j == n || i == 1 || i == n || i == j || j == n - i + 1)
		{
		printf("*");
		}
		else if(j < n && j > 1)
			printf(" ");
	}
	printf("\n");
}
}

void shape2(int n) {
	int i;
	int j;
for(j = 1; j <= n; j++){
	for(i = 1; i <= n; i++)
	{
		if(j == 1 || j == n || i == 1 || i == n || i == j)
		{
		printf("*");
		}
		else if(j < n && j > 1)
			printf(" ");
	}
	printf("\n");
}
}

void shape3(int n) {
	int i;
	int j;
for(j = 1; j <= n; j++){
	for(i = 1; i <= n; i++)
	{
		if(j == 1 || j == n || i == 1 || i == n || i == j || i < j)
		{
		printf("*");
		}
		else if(j < n && j > 1)
			printf(" ");
	}
	printf("\n");
}
}

void shape4(int n) {
	int i;
	int j;
for(j = 1; j <= n; j++){
	for(i = 1; i <= n; i++)
	{
		if((j == 1 || j == n || i == 1 || i == n || i == j || j == n - i + 1) || (j <= n / 2 && i <= n - j && i > j ))
		{
		printf("*");
		}
		else if(j < n && j > 1)
			printf(" ");
	}
	printf("\n");
}
}


int main() {
	shape4(10);
return 0;
}

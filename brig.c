/*
 * brig.c
 *
 *  Created on: 22 сент. 2019 г.
 *      Author: ilya
 */

#include<stdio.h>

void brig(int week) {

	switch (week % 4) {
	case 1:
		printf("Peter");
		break;
	case 2:
		printf("John");
		break;
	case 3:
		printf("Tigran");
		break;
	case 0:
		printf("Moshe");
		break;
	}
}

void brig2(int week)
{
	if (week % 4 == 1)
	{
		printf("Peter");
	}
	else if (week % 4 == 2)
		{
			printf("John");
		}
	else if (week % 4 == 3)
		{
			printf("Tigran");
		}
	else if (week % 4 == 0)
		{
			printf("Moshe");
		}
}

void bank(int week)
{
		switch (week) {
		case 1:
			printf("Банк работает в воскресенье с 8:30 до 13:30");
			break;
		case 2:
			printf("Банк работает в понедельник с 8:30 до 13:00 и с 16:00 до 18:00");
			break;
		case 3:
			printf("Банк работает во вторник с 8:30 до 13:30");
			break;
		case 4:
			printf("Банк работает в среду с 8:30 до 13:00 и с 16:00 до 18:00");
			break;
		case 5:
			printf("Банк работает в четверг с 8:30 до 13:30");
			break;
		case 6:
			printf("В пятницу банк не работает");
			break;
		case 7:
			printf("В субботу банк не работает");
			break;
	}
}

void bank2(int week)
{
	if(week == 1 || week == 3 || week == 5)
	{
		printf("Банк работает с 8:30 до 13:30");
	}
	else if(week == 2 || week == 4)
	{
		printf("Банк работает c 8:30 до 13:00 и с 16:00 до 18:00");
	}
	else if (week == 6 || week == 7)
	{
		printf("Банк не работает");
	}
	else
	{
		printf("Банк не работает");
	}
	}

int main() {
	bank(4);
	return 0;
}

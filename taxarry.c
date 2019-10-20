/*
 * taxarry.c
 *
 *  Created on: 15 окт. 2019 г.
 *      Author: ilya
 */

#include <stdio.h>

float taxIsr(float salary, float taxAllowance)
{
	float tax = -taxAllowance * 216;
	int i;
	float res;
	int range1[] = {0, 6310, 9050, 14530, 20200, 42030, 54130, 2147483647};
	float range2[] = {0.1, 0.14, 0.2, 0.31, 0.35, 0.47, 0.5};

	for(i = 0; salary >= range1[i]; i++)
	{
		res = tax + (salary - range1[i]) * range2[i];
		if (salary >= range1[i] && salary < range1[i + 1])
		return res > 0? res : 0;
		else
		tax = tax + (range1[i + 1] - range1[i]) * range2[i];
	}
	if(tax > 0)
	return tax;
	else
	return 0;
	}

float newsalary(float salary)
{
	return salary - taxIsr(66000, 5.25);
	}


int main()
{
	float salary = newsalary(66000);
	printf("salary = %f\n", salary);
	float tax = taxIsr(66000, 5.25);
	printf("tax = %f\n", tax);
	return 0;
	}

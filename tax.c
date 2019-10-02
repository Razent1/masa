/*
 * tax.c
 *
 *  Created on: 23 сент. 2019 г.
 *      Author: ilya
 */

#include<stdio.h>

float taxIsrael(float salary, float taxAllowance){

	float tax = -taxAllowance * 216;
	if (salary < 6310){
		return tax + salary * 0.1;
	} else {
		tax = tax + 6310 * 0.1;
	}

	if (salary >= 6310 && salary < 9050){
		return tax + (salary - 6310) * 0.14;
	} else {
		tax = tax + (9050 - 6310) * 0.14;
	}

	if (salary >= 9050 && salary < 14530){
		return tax + (salary - 9050) * 0.2;
	} else {
		tax = tax + (14530 - 9050) * 0.2;
	}

	if (salary >= 14530 && salary < 20200){
		return tax + (salary - 14530) * 0.31;
	} else {
		tax = tax + (20200 - 14530) * 0.31;
	}

	if (salary >= 20200 && salary < 42030){
		return tax + (salary - 20200) * 0.35;
	} else {
		tax = tax + (42030 - 20200) * 0.35;
	}
	if (salary >= 42030 && salary < 54130){
		return tax + (salary - 42030) * 0.47;
	} else {
		tax = tax + (54130 - 42030) * 0.47;
	}
	return tax + (salary - 54130) * 0.5;

}
float salary(float salary, float taxAllowance){
    return salary - taxIsrael(salary, taxAllowance);
}

float powXY(float x, int y) // возведение в степень
{
	int i;
	int res;

	i = 1;
	res = x;
	if (y != 0) {
		while (i < y) {
			res = x * res;
			i++;
		}
	} else {
		return 1;
	}
	return res;
}
int main(){
	float tax = taxIsrael(1, 2.25);
	printf("%f", tax);

	return 0;
}


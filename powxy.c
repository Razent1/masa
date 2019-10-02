/*
 * powxy.c
 *
 *  Created on: 2 окт. 2019 г.
 *      Author: ilya
 */


float powXY(float x, int y)
{
	int i;
	float res;

	res = x;
	if (y < 0)
	{
		y = y * (-1);
		for (i = 1; i < y; i++)
		{
			res = x * res;
		}
		return 1 / res;
	}
	else if(y > 0)
		{
		for (i = 1; i < y; i++)
			{
				res = x * res;
			}
			return res;
		}
	 else
		return 1;

}
int main()
{
	printf("%f", powXY(3, 0));
	return 0;
	}

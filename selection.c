#include <stdio.h>

void selection2(int *s, int n)
{
	int i;
	int j = 0;

	for (i = 0; i < n - 1; i++) {
		int small = i;
		for (j = i + 1; j < n; j++) {
			if (s[j] < s[small]) {
				small = j;
			}
		}
		int tmp = s[i];
		s[i] = s[small];
		s[small] = tmp;
	}
}
int main() {
	int a[] = { 4, 2, 7, 3 };
	int i;

	selection2(a, 4);
	for (i = 0; i < 4; i++)
		printf("%d ", a[i]);

	return 0;
}

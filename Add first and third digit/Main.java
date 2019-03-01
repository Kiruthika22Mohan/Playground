#include<stdio.h>
int main()
{
  int n;
  scanf("%d", &n);
  int f = n % 10;
  int s = (n /10)/ 10;
  printf("%d", f + s);
  return 0;
}
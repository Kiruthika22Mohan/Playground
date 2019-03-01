#include<stdio.h>
int main()
{
  int n = 365;
 // scanf("%d",&n);
  int c = n/4;
  int d = n%4;
  printf("Quotient: %d",c);
  printf("\nRemainder: %d",d);
  return 0;
}
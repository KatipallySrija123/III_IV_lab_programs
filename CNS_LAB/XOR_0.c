#include<stdio.h>
#include<string.h>

int main()
{
 int i, l;
 char str[50];
// scanf("%s", str);
 gets(str);
 for(i = 0; i < strlen(str); i++)
 {
  str[i] = str[i] ^ 0;
 }
 printf("After XOR: %s\n", str);
}

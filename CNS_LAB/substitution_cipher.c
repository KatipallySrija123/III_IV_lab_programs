#include<stdio.h>
#include<string.h>

int main()
{
 char key[50], input[50], cipher[50];
 printf("Enter plain text: ");
 gets(input);
 printf("Enter key: ");
 gets(key);
 for(int i = 0; input[i] != '\0'; i++){
  int idx = input[i] - 'a';
  cipher[i] = key[idx];
 }
 printf("%s\n", cipher);
 return 0;
}

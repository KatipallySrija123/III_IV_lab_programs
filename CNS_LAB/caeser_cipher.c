#include<stdio.h>
#include<string.h>

int main()
{
 int key;
 char str[25]; 
 gets(str);
 printf("Enter key:");
 scanf("%d", &key);
 int len = strlen(str);
 for(int i = 0; i < len; i++){
  str[i] = (str[i] + key - 'a') % 26 + 'a';
 }
 printf("Encrypted String: %s\n", str);
 for(int i = 0; i < len;i++){
  str[i] = (str[i] - key - 'a') % 26 + 'a';
 }
 printf("decrypted String: %s\n", str);
}  

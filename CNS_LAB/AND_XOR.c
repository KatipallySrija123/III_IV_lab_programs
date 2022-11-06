#include<stdio.h>
#include<string.h>

int main()
{
 char s1[50], s2[50], s3[50];
 printf("Enter String: ");
 gets(s1);
 for(int i = 0; i < strlen(s1); i++)
 {
  s2[i] = s1[i] & 127;
 }
 for(int i = 0; i < strlen(s1); i++)
 {
  s3[i] = (s1[i] ^ 127) ^ 127;
 }
 printf("After AND: %s\n", s2); 
 printf("After XOR: %s\n", s3); 
}

#include<stdio.h>
#include<string.h>
#include<stdlib.h>

void pm();
void plus();
void func();
void strReverse(char* str);

int i,ch,j,l,addr=100;
char ex[10], expe[10] ,exp1[10],exp21[10],id1[5],op[5],id2[5];
void main()
{
    while(1)
    {
        printf("\n 1.assignment\n 2.arithmetic\n 3.relational\n 4.Exit\nEnter the choice:");
        scanf("%d",&ch);
        switch(ch)
        {
            case 1:
                printf("\nEnter the expression with assignment operator:");
                scanf("%s",expe);
                l=strlen(expe);
                exp21[0]='\0';
                i=0;
                while(expe[i]!='=')
                {
                    i++;
                }
                strncat(exp21,expe,i);
                strReverse(expe);
                exp1[0]='\0';
                strncat(exp1,expe,l-(i+1));
                strReverse(exp1);
                printf("Three address code:\ntemp=%s\n%s=temp\n",exp1,exp21);
                break;
            case 2:
                printf("\nEnter the expression with arithmetic operator:");
                scanf("%s",ex);
                strcpy(expe,ex);
                l=strlen(expe);
                exp1[0]='\0';
                for(i=0;i<l;i++)
                {
                    if(expe[i]=='+'||expe[i]=='-')
                    {
                        if(expe[i+2]=='/'||expe[i+2]=='*')
                        {
                            pm();
                            break;
                        }
                        else
                        {
                            plus();
                            break;
                        }
                    }
                    else if(expe[i]=='/'||expe[i]=='*')
                    {
                        func();
                        break;
                    }
                }
                break;
            case 3:
                printf("Enter the expression with relational operator");
                scanf("%s%s%s", id1, op, id2);
                if(((strcmp(op,"<")==0)||(strcmp(op,">")==0)||(strcmp(op,"<=")==0)||(strcmp(op,">=")==0)||(strcmp(op,"==")==0)||(strcmp(op,"!=")==0))==0)
                    printf("Expression is error");
                else
                {
                    printf("\n%d\tif %s%s%s goto %d",addr,id1,op,id2,addr+3);
                    addr++;
                    printf("\n%d\t T:=0",addr);
                    addr++;
                    printf("\n%d\t goto %d",addr,addr+2);
                    addr++;
                    printf("\n%d\t T:=1",addr);
                }
                break;
                case 4:
                exit(0);
        }
    }
}

void pm()
{
    strReverse(expe);
    j=l-i-1;
    strncat(exp1,expe,j);
    strReverse(exp1);
    printf("Three address code:\ntemp=%s\ntemp1=%c%ctemp\n",exp1,expe[j+1],expe[j]);
}

void func()
{
    strncat(exp1,expe,i+2);
    printf("Three address code:\ntemp=%s\ntemp1=temp%c%c\n",exp1,expe[i+2],expe[i+3]);
}

void plus()
{
    strncat(exp1,expe,i+2);
    printf("Three address code:\ntemp=%s\ntemp1=temp%c%c\n",exp1,expe[i+2],expe[i+3]);
}

void strReverse(char *str) {
    int xy = strlen(str);
    for(int i = 0; i < xy/2; i++) {
        char ch = str[i];
        str[i] = str[xy - i - 1];
        str[xy - i - 1] = ch;
    }
}


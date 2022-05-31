%{
#include <stdio.h>
int c=0,w=0,s=0,l=0;
%}

word [^ \t\n,\.:]+
eol [\n]
blank [ ]
    
%%

{word} {w++; c=c+yyleng;}
{eol} {l++;}
{blank} {s++;}

%%

int yywrap() {
return 1;
}

void main(int argc,char *argv[])
{
if (argc!=2)
{
printf("usage : ./a.out in.txt \n");
exit(0);
}
yyin=fopen(argv[1],"r");
yylex();
printf("no. of word %d \n",w);
printf("no. of char %d \n",c);
printf("no. of line %d \n",l);
printf("no. of space %d \n",s);
}

%{
#include<stdio.h>
%}

%%
[\n] {printf("\n\nEnter the input: ");}

auto|double|int|struct|break|else|long|switch|case|enum|register|typedef|char|extern|return|union|continue|for|signed|void|do|if|static|while|default|goto|sizeof|volatile|const|float|short {printf("This is Keyword");}

[a-z A-Z _][a-z A_Z 0-9 _]* {printf("This is Identifier");}

[0-9]* {printf("This is Number");}

[+-/*%=] {printf("This is Operator");}

.* {printf("Invalid");}

%%
int yywrap(){}
int main()
{
 printf("\nEnter the input: ");
 yylex();
 return 0;
}

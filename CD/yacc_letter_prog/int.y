%{
#include<stdio.h>
int valid = 1;
%}

%token digit letter
%%
start:letter
     | digit
     |
     ;
%%
int yyerror(){
printf("its not a identifier\n");
valid = 0;
return 0;
}

int main() {
    printf("Enter name to be tested\n");
    yyparse();
    if(valid) {
        printf("its a identifier\n");
    }
}


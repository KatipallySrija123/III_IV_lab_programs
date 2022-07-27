%{
    #include"y.tab.h"
%}

%%
[a-z A-Z _][a-zA-Z_ 0-9]* return letter;
[0-9] return digit;
. return yytext[0];
\n return 0;

%%

int yywrap() {
    return 1;
}

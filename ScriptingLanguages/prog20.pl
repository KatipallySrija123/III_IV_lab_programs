cse@cselab1-28:~$ cat add.tcl
set a 20
set b 30
set c [expr $a+$b]
puts $c
cse@cselab1-28:~$ perl -e 'print reverse <>' add.tcl
puts $c
set c [expr $a+$b]
set b 30
set a 20
cse@cselab1-28:~$ ^C


proc printTable {x} {
	for {set i 1} {$i <= 10} {incr i} {
		set temp [expr $x*$i]
		puts "$x x $i = $temp"
	}
}

proc main {} {
	puts "Enter number: "
	gets stdin x
	printTable $x
}

main
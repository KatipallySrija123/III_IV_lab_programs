gets stdin n
set f 1
for {set i 1} {$i <= $n} {incr i} {
	set f [expr {$f * $i}]
}
puts "$n! = $f"
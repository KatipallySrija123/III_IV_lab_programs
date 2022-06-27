set var {1 2 3}
puts $var

puts "Appending a list"
lappend var 4
puts $var

puts "concatenating list"
set var1 {5 6 7}
set var2 [concat $var $var1]
puts $var2


puts "Traversing list"
set i 0
foreach i $var2 {
	puts $i
	incr i
}
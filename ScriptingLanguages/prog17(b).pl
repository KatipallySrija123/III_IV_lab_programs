print "enter number: \n";
$n = <stdin>;
print "multiplication table of $n\n";
for($i=1;$i<=10;$i++) {
	$m = $n * $i;
	print "$n * $i = $m\n";
}
print "\n";
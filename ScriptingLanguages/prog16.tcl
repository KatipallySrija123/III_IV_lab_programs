proc File_Copy {src dest} {
if {[file isdirectory $src]} {
file mkdir $dest
foreach f [glob -nocomplian [file join $src *]] {
File_Copy $f [file join $dest [file tail $f]]
}
return
}
if {[file isdirectory $dest]} {
	set dest [file join $dest [file tail $src]]
}
set in [open $src]
set out [open $dest w]
puts -nonewline $out [ read $in]
close $out; close $in;
}


File_Copy prog11.tcl native.txt

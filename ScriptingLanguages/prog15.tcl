proc newer {file1 file2} {
	if {![file exists $file2]} {
		return 1
	} else {

		expr {[file mtime $file1] > [file mtime $file2]}
	}
}

newer prog12.tcl prog11.tcl


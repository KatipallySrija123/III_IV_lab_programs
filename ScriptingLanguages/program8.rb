def checkTemp(t1, t2)
	return (t1 < 0 && t2 > 100) || (t1 > 100 && t2 < 0)
end


puts "enter t1 and t2: "
t1 = gets.to_f()
t2 = gets.to_f()
puts checkTemp(t1, t2)
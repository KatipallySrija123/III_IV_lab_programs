def func(x, y)
	if x == 20 || y == 20
		return true
	end
	puts "Neither of them is 20"
	return x + y
end

puts func(10, 10)
puts func(20, 20)
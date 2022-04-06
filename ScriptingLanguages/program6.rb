=begin
ruby script to print odd numbers from 10 to 1
=end

x = 10
while x >= 1
	if x % 2 != 0
		puts x
	end
	x -= 1
end

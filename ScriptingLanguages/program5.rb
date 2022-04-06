=begin
ruby script to find greatest of three numbers
=end

puts "Enter 3 numbers"
num1 = gets.to_i()
num2 = gets.to_i()
num3 = gets.to_i()

if num1 >= num2 && num1 >= num3
	puts "Greatest is :#{num1}"


elsif num2 >= num1 && num2 >= num3 
	puts "Greatest is :#{num2}"

else
	puts "Greatest is: #{num3}"

end

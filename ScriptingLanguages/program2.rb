=begin
ruby script to read radius and print perimeter and area of a circle.
=end

r = gets.to_f()
perimeter = 2 * 3.14 * r
area = 3.14 * r**2

puts "perimeter is #{perimeter}"
puts "Area is #{area}"

marksSet = Hash.new()
marksSet['subject1'] = 90
marksSet['subject2'] = 80
marksSet['subject3'] = 70

c = 0
marksSet.each{|key, value| c += value}
puts "Total Marks: #{c}"
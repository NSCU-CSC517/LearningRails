# Please write down in order all the matches of /[M-m]\d{2,},?/ found in strings
# "Apple10, Banana1, Lemon12, Kiwi66 Peach333, PEAR22."

puts 'Please write down in order all the matches of /[M-m]\d{2,},?/ found in strings
      "Apple10, Banana1, Lemon12, Kiwi66 Peach333, PEAR22."'

# Solution

puts 'Apple10' =~ /[M-m]\d{2,},?/
puts 'Banana1' =~ /[M-m]\d{2,},?/
puts 'Lemon12' =~ /[M-m]\d{2,},?/
puts 'Kiwi66' =~ /[M-m]\d{2,},?/
puts 'Peach333' =~ /[M-m]\d{2,},?/
puts 'PEAR22' =~ /[M-m]\d{2,},?/

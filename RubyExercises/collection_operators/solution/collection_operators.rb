def init
  @a = %w(a b c d)
  @b = [1, 2, 3, 4]
  puts ''
end

init

# print __________(1)__________ #=> [1, 2, 3, 4, "a", "b", "c", "d"]
print @b.concat(@a) #=> [1, 2, 3, 4, "a", "b", "c", "d"]
init

# print __________(2)__________ #=> [2, 3]
print @b.select {|x|2<=x&&x<=3} #=> [2, 3]
init

# print __________(3)__________ #=> [4, 3, 2, 1]
print @b.reverse #=> [4, 3, 2, 1]
init

# print __________(4)__________ #=> [2, 3, 4, 5]
print @b.collect{|x|x+1} #=> [2, 3, 4, 5]
init

# print __________(5)__________ #=> ["b", "c", "d", "a"]
print @a.rotate #=> ["b", "c", "d", "a"]
init

# print __________(6)__________ #=> ["aa", "bb", "cc", "dd"]
print @a.collect{|x|x+x} #=> ["aa", "bb", "cc", "dd"]
init

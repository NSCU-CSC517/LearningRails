class Array
  def every_third
    index = 0
    # __________(1)__________.each do |x|
    self.each do |x|
      # __________(2)__________ x if (index % 3).zero?
      yield x if (index % 3).zero?
      # __________(3)__________
      index += 1
    end
  end
end

[1, 2, 3, 4, 5, 6, 7, 8, 9].every_third { |x| print "#{x}, " }

require_relative 'group'

class Block < Group
  # def __________(2)__________(width, length)
  def initialize(width, length)
    @width = width
    @length = length
  end

  def assemble
    puts "    Adding a block with dimensions #{@width} x #{@length}"
  end
end

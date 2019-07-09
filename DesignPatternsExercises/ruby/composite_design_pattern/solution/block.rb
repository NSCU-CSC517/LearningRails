require_relative 'group'

class Block < Group
  def initialize(width, length)
    super(width, length)
  end

  def assemble
    puts "    Adding a block with dimensions #{@width} x #{@length}"
  end
end

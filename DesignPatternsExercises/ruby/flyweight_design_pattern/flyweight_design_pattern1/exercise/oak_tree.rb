require_relative 'tree'

class OakTree < __________(5)__________
  attr_accessor :root_depth

  def __________(6)__________
    __________(7)__________(false, false, 70)
    @forest_type = :Deciduous
    @root_depth = 0
  end

  def __________(8)__________
    puts 'Changing Oak Tree property Forest Type to Evergreen'
    puts
    @forest_type = :Evergreen
  end

  def to_string
    "Oak Tree ~~ Height: #{@height}  Flowers: #{@has_flowers}  Fruits: #{@has_fruits}  Root Depth: #{@root_depth}  Forest Type: #{@forest_type}"
  end
end

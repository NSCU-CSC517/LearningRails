require_relative 'tree'

class FloweringCherry < __________(1)__________
  def __________(2)__________
    __________(3)__________(true, false, 20)
    @flower_color = :Pink
  end

  def __________(4)__________
    puts 'Changing Flowering Cherry property Flower Color to Violet'
    puts
    @flower_color = :Violet
  end

  def to_string
    "Flowering Cherry ~~ Height: #{@height}  Flowers: #{@has_flowers}  Fruits: #{@has_fruits}  Flower Color: #{@flower_color}"
  end
end

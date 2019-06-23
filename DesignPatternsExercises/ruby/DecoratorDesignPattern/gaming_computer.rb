require_relative 'hardware_customizer.rb'

class GamingComputer < HardwareCustomizer
  # _________(5)_________(new_comp)
  def initialize(new_comp)
    # _________(6)_________
    super new_comp

    @graphics = 2
    @graphics_cost = 10
  end

  def parts
    # "#{_________(7)_________} Graphics Card = #{@graphics} GB"
    "#{@temp_comp.parts} Graphics Card = #{@graphics} GB"
  end

  def cost
    @temp_comp.cost + @graphics_cost
  end
end

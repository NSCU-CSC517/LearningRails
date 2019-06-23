require_relative 'hardware_customizer.rb'

class GamingComputer < HardwareCustomizer
  # __(5)__(newComp)
  def initialize(new_comp)
    # __(6)__
    super new_comp
    @graphics = 2
    @graphics_cost = 10
  end

  def parts
    # "#{__(7)__} Graphics Card = #{@graphics} GB"
    "#{@temp_comp.parts} Graphics Card = #{@graphics} GB"
  end

  def cost
    @temp_comp.cost + @graphics_cost
  end
end

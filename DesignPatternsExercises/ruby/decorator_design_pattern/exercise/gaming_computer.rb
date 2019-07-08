require_relative 'hardware_customizer.rb'

class GamingComputer < __________(2)__________
  def initialize(new_comp)
    super(new_comp)
    @graphics = 2
    @graphics_cost = 10
  end

  def parts
    "#{__________(3)__________} Graphics Card = #{@graphics} GB"
  end

  def cost
    @computer.cost + @graphics_cost
  end
end

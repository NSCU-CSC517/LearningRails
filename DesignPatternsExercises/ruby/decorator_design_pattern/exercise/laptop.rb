require_relative 'hardware_customizer.rb'

class Laptop < __________(6)__________
  def initialize(new_comp)
    super(new_comp)
    @ssd = 200
    @ssd_cost = 80
  end

  def parts
    "#{__________(7)__________} Solid State Drive = #{@ssd} GB"
  end

  def cost
    @computer.cost + @ssd_cost
  end
end

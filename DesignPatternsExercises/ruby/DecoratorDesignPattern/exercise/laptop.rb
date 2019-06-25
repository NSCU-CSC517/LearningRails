require_relative 'hardware_customizer.rb'

class Laptop < HardwareCustomizer
  def initialize(new_comp)
    __________(3)__________
    @ssd = 200
    @ssd_cost = 80
  end

  def parts
    "#{__________(4)__________} Solid State Drive = #{@ssd} GB"
  end

  def cost
    @temp_comp.cost + @ssd_cost
  end
end

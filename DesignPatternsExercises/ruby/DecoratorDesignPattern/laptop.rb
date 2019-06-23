require_relative 'hardware_customizer.rb'

class Laptop < HardwareCustomizer
  def initialize(new_comp)
    # __(3)__
    super new_comp
    @ssd = 200
    @ssd_cost = 80
  end

  def parts
    # "#{__(4)__} Solid State Drive = #{@ssd} GB"
    "#{@temp_comp.parts} Solid State Drive = #{@ssd} GB"
  end

  def cost
    @temp_comp.cost + @ssd_cost
  end
end

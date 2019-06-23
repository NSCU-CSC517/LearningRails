require_relative 'hardware_customizer.rb'

class Laptop < HardwareCustomizer
  def initialize(new_comp)
    # __________(3)__________
    super new_comp

    @ssd = 200
    @ssd_cost = 80
  end

  def parts
    # "#{__________(4)__________} Solid State Drive = #{@ssd} GB"
    "#{@temp_comp.parts} Solid State Drive = #{@ssd} GB"
  end

  def cost
    @temp_comp.cost + @ssd_cost
  end
end

require_relative 'hardware_customizer.rb'

class Laptop < HardwareCustomizer
  def initialize(new_comp)
    # _________(3)_________
    super new_comp

    @ssd = 200
    @ssd_cost = 80
  end

  def parts
    # "#{_________(4)_________} Solid State Drive = #{@ssd} GB"
    "#{@temp_comp.parts} Solid State Drive = #{@ssd} GB"
  end

  def cost
    @temp_comp.cost + @ssd_cost
  end
end

require_relative 'hardware_customizer.rb'

class GamingComputer < HardwareCustomizer
  __________(5)__________(new_comp)
    __________(6)__________

    @graphics = 2
    @graphics_cost = 10
  end

  def parts
    "#{__________(7)__________} Graphics Card = #{@graphics} GB"
  end

  def cost
    @temp_comp.cost + @graphics_cost
  end
end

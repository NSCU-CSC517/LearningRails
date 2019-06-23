require_relative 'computer.rb'

class HardwareCustomizer < Computer
  def initialize(new_comp)
    # __(1)__
    @temp_comp = new_comp
  end

  def parts
    # __(2)__
    @temp_comp.parts
  end

  def cost
    @temp_comp.cost
  end
end

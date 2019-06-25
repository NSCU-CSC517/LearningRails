require_relative 'computer.rb'

class HardwareCustomizer < Computer
  def initialize(new_comp)
    # __________(1)__________
    @temp_comp = new_comp
  end

  def parts
    # __________(2)__________
    @temp_comp.parts
  end

  def cost
    @temp_comp.cost
  end
end

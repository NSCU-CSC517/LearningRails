require_relative 'computer.rb'

class HardwareCustomizer < Computer
  def initialize(new_comp)
    # _________(1)_________
    @temp_comp = new_comp
  end

  def parts
    # _________(2)_________
    @temp_comp.parts
  end

  def cost
    @temp_comp.cost
  end
end

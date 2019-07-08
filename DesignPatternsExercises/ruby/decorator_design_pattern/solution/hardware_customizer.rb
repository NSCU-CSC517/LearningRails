require_relative 'computer.rb'

class HardwareCustomizer < Computer
  # def __________(4)__________(new_comp)
  def initialize(new_comp)
    @computer = new_comp
  end

  def parts
    # __________(5)__________
    @computer.parts
  end

  def cost
    @computer.cost
  end
end

require_relative 'mouse'
require_relative 'pc_builder'

class ComputerBuilder < __________(2)__________
  def add_mouse(type)
    mouse = __________(3)__________(type)
    @computer.add_mouse mouse
    __________(4)__________
  end
end

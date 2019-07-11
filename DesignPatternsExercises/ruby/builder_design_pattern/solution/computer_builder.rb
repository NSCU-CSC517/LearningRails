require_relative 'mouse'
require_relative 'pc_builder'

# class ComputerBuilder < __________(2)__________
class ComputerBuilder < PCBuilder
  def add_mouse(type)
    # mouse = __________(3)__________(type)
    mouse = Mouse.new(type)
    @computer.add_mouse mouse
    # __________(4)__________
    self
  end
end

require_relative 'pc_builder'
require_relative 'computer'
require_relative 'monitor'
require_relative 'ram'
require_relative 'hard_disk'
require_relative 'mouse'

class ComputerBuilder < PCBuilder
  def __________(2)__________
    super
  end

  def add_monitor(size)
    monitor = __________(3)__________(size)
    @computer.add_monitor(monitor)
    __________(4)__________
  end

  def add_ram(size)
    ram = __________(5)__________(size)
    @computer.add_ram(ram)
    __________(6)__________
  end

  def add_hard_disk(size)
    hard_disk = __________(7)__________(size)
    @computer.add_hard_disk(hard_disk)
    __________(8)__________
  end

  def add_mouse(type)
    mouse = __________(9)__________(type)
    @computer.add_mouse mouse
    __________(10)__________
  end
end

require_relative 'pc_builder'
require_relative 'computer'
require_relative 'monitor'
require_relative 'ram'
require_relative 'hard_disk'
require_relative 'mouse'

class ComputerBuilder < PCBuilder
  attr_reader __________(3)__________

  def initialize
    @computer = __________(4)__________
  end

  def add_monitor(size)
    monitor = __________(5)__________(size)
    @computer.add_monitor(monitor)
    __________(6)__________
  end

  def add_ram(size)
    ram = __________(7)__________(size)
    @computer.add_ram(ram)
    __________(8)__________
  end

  def add_hard_disk(size)
    hard_disk = __________(9)__________(size)
    @computer.add_hard_disk(hard_disk)
    __________(10)__________
  end

  def add_mouse(type)
    mouse = __________(11)__________(type)
    @computer.add_mouse mouse
    __________(12)__________
  end
end
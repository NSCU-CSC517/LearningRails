require_relative 'pc_builder'
require_relative 'computer'
require_relative 'monitor'
require_relative 'ram'
require_relative 'hard_disk'
require_relative 'mouse'

class ComputerBuilder < PCBuilder
  # def __________(2)__________
  def initialize
    super
  end

  def add_monitor(size)
    # monitor = __________(3)__________(size)
    monitor = Monitor.new(size)
    @computer.add_monitor(monitor)
    # __________(4)__________
    self
  end

  def add_ram(size)
    # ram = __________(5)__________(size)
    ram = Ram.new(size)
    @computer.add_ram(ram)
    # __________(6)__________
    self
  end

  def add_hard_disk(size)
    # hard_disk = __________(7)__________(size)
    hard_disk = HardDisk.new(size)
    @computer.add_hard_disk(hard_disk)
    # __________(8)__________
    self
  end

  def add_mouse(type)
    # mouse = __________(9)__________(type)
    mouse = Mouse.new(type)
    @computer.add_mouse mouse
    # __________(10)__________
    self
  end
end

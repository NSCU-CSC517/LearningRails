require_relative 'computer'
require_relative 'hard_disk'
require_relative 'monitor'
require_relative 'ram'

class PCBuilder
  attr_reader __________(9)__________

  def __________(10)__________
    @computer = __________(11)__________
  end

  def add_monitor(size)
    monitor = __________(12)__________(size)
    @computer.add_monitor(monitor)
    __________(13)__________
  end

  def add_ram(size)
    ram = __________(14)__________(size)
    @computer.add_ram(ram)
    __________(15)__________
  end

  def add_hard_disk(size)
    hard_disk = __________(16)__________(size)
    @computer.add_hard_disk(hard_disk)
    __________(17)__________
  end

  def add_mouse(type)
    raise NotImplementedError, 'Subclasses must override this method'
  end
end

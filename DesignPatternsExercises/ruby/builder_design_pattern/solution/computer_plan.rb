class ComputerPlan
  attr_reader :monitor_list, :ram_list, :hdd_list, :mouse

  # def __________(16)__________
  def initialize
    @monitor_list = []
    @ram_list = []
    @hdd_list = []
  end

  def add_monitor(monitor)
    @monitor_list << monitor
  end

  def add_ram(ram)
    @ram_list << ram
  end

  def add_hard_disk(hard_disk)
    @hdd_list << hard_disk
  end

  def add_mouse(mouse)
    @mouse = mouse
  end
end

require_relative 'computer_plan'

class Computer < ComputerPlan
  def __________(1)__________
    super
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

  def ram_capacity
    capacity = 0
    @ram_list.each { |ram| capacity += ram.capacity }
    capacity
  end

  def hdd_capacity
    capacity = 0
    @hdd_list.each { |hdd| capacity += hdd.capacity }
    capacity
  end
end
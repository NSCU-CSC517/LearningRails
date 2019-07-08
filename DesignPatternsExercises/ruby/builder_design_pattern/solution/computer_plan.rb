class ComputerPlan
  attr_reader :monitor_list, :ram_list, :hdd_list, :mouse

  def initialize
    @monitor_list = []
    @ram_list = []
    @hdd_list = []
  end

  def add_monitor(monitor)
    raise NotImplementedError, 'Subclass must override this method'
  end

  def add_ram(ram)
    raise NotImplementedError, 'Subclass must override this method'
  end

  def add_hard_disk(hard_disk)
    raise NotImplementedError, 'Subclass must override this method'
  end

  def add_mouse(mouse)
    raise NotImplementedError, 'Subclass must override this method'
  end
end

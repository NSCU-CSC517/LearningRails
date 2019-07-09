class PCBuilder
  attr_reader :computer

  def initialize
    @computer = __________(14)__________
  end

  def add_monitor(size)
    raise NotImplementedError, 'Subclass must override this method'
  end

  def add_ram(size)
    raise NotImplementedError, 'Subclass must override this method'
  end

  def add_hard_disk(size)
    raise NotImplementedError, 'Subclass must override this method'
  end

  def add_mouse(type)
    raise NotImplementedError, 'Subclass must override this method'
  end
end

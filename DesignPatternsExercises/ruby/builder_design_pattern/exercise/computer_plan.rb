class ComputerPlan
  def add_monitor
    raise NotImplementedError, 'Subclass must override this method'
  end

  def add_ram
    raise NotImplementedError, 'Subclass must override this method'
  end

  def add_hard_disk
    raise NotImplementedError, 'Subclass must override this method'
  end

  def add_mouse
    raise NotImplementedError, 'Subclass must override this method'
  end
end

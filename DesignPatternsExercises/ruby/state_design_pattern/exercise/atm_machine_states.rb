class AtmMachineStates
  def eject_card?
    raise NotImplementedError, 'Subclasses must override this method'
  end

  def insert_card?
    raise NotImplementedError, 'Subclasses must override this method'
  end

  def withdraw?
    raise NotImplementedError, 'Subclasses must override this method'
  end
end

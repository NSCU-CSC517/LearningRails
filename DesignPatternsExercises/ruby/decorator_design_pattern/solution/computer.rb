class Computer
  def parts
    raise NotImplementedError, 'Subclass must override this method'
  end

  def cost
    raise NotImplementedError, 'Subclass must override this method'
  end
end

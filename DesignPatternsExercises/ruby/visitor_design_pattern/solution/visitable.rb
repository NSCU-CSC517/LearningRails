class Visitable
  def accept(visitor)
    raise NotImplementedError, 'Subclasses must override this method'
  end
end

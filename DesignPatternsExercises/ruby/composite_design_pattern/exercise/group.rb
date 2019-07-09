class Group
  def __________(2)__________(width, length)
    @width = width
    @length = length
  end

  def assemble
    raise NotImplementedError, 'Subclass must override this method'
  end
end

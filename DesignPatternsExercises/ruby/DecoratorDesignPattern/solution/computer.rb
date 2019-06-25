class Computer
  def parts
    raise NotImplementedError.new('Implement this method in a subclass')
  end

  def cost
    raise NotImplementedError.new('Implement this method in a subclass')
  end
end

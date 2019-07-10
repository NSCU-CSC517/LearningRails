class Warehouse
  def initialize
    # __________(8)__________ = []
    @home_theatre_list = []
  end

  # def __________(9)__________(memento)
  def add_memento(memento)
    @home_theatre_list << memento
  end

  def memento(index)
    @home_theatre_list[index]
  end
end

class Warehouse
  def initialize
    # __________(9)__________ = []
    @home_theatre_list = []
  end

  # def __________(10)__________(memento)
  def add_memento(memento)
    @home_theatre_list << memento
  end

  def memento(index)
    @home_theatre_list[index]
  end
end

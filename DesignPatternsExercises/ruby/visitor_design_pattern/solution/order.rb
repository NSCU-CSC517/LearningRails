require_relative 'visitable'

class Order < Visitable
  # attr_reader __________(9)__________, :items
  attr_reader :name, :items

  def initialize(name)
    @name = name
    # __________(10)__________ = []
    @items = []
  end

  # def __________(11)__________(visitor)
  def accept(visitor)
    # visitor.__________(12)__________
    visitor.visit(self)
  end

  def add_item(item)
    @items << item
  end
end

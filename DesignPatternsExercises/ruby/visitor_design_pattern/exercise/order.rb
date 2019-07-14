require_relative 'visitable'

class Order < Visitable
  attr_reader __________(9)__________, :items

  def initialize(name)
    @name = name
    __________(10)__________ = []
  end

  def __________(11)__________(visitor)
    visitor.__________(12)__________
  end

  def add_item(item)
    @items << item
  end
end

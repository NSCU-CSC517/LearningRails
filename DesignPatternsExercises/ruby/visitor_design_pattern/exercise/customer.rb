require_relative 'visitable'

class Customer < Visitable
  attr_reader :name

  def __________(1)__________(name)
    @name = name
    __________(2)__________ = []
  end

  def __________(3)__________(visitor)
    visitor.__________(4)__________
    puts 'Orders:'
    @orders.each { |order| order.__________(5)__________ }
    puts
  end

  def add_order(order)
    @orders << order
  end
end

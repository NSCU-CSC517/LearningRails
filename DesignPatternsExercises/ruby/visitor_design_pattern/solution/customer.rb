require_relative 'visitable'

class Customer < Visitable
  attr_reader :name

  # def __________(1)__________(name)
  def initialize(name)
    @name = name
    # __________(2)__________ = []
    @orders = []
  end

  # def __________(3)__________(visitor)
  def accept(visitor)
    # visitor.__________(4)__________
    visitor.visit(self)
    puts 'Orders:'
    # @orders.each { |order| order.__________(5)__________ }
    @orders.each { |order| order.accept(visitor) }
    puts
  end

  def add_order(order)
    @orders << order
  end
end

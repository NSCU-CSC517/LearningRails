require_relative 'customer'
require_relative 'order'
require_relative 'general_report'

customer1 = Customer.new(:Customer1)
order1 = Order.new(:Order1)
order1.add_item(:Item1)
order1.add_item(:Item2)
customer1.add_order(order1)
order2 = Order.new(:Order2)
order2.add_item(:Item3)
order2.add_item(:Item4)
customer1.add_order(order2)

customer2 = Customer.new(:Customer2)
order3 = Order.new(:Order3)
order3.add_item(:Item5)
order3.add_item(:Item6)
customer2.add_order(order3)

visitor = GeneralReport.new
customer1.accept(visitor)
customer2.accept(visitor)

visitor.display_results

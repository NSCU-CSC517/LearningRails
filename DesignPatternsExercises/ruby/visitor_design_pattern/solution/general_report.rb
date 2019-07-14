require_relative 'visitor'
require_relative 'customer'

class GeneralReport < Visitor
  # def __________(6)__________
  def visit(node)
    # if node.respond_to?(__________(7)__________)
    if node.respond_to?(:items)
      puts "    #{node.name}"
      puts '    Items:'
      # node.items.__________(8)__________ { |order| puts "        #{order}" }
      node.items.each { |order| puts "        #{order}" }
      @orders_number ||= 0
      @orders_number += 1
    else
      puts "Customer: #{node.name}"
      @customers_number ||= 0
      @customers_number += 1
    end
  end

  def display_results
    puts "Number of customers: #{@customers_number}"
    puts "Number of orders:    #{@orders_number}"
  end
end

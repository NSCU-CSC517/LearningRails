require_relative 'basic_computer.rb'
require_relative 'gaming_computer.rb'
require_relative 'laptop.rb'

class DecoratorDesignPattern
  customized_pc = GamingComputer.new(Laptop.new(BasicComputer.new))
  puts "Parts: #{customized_pc.parts}"
  puts "Cost = #{customized_pc.cost}"
end

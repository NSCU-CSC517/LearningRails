require_relative 'computer_plan'

# class Computer < __________(1)__________
class Computer < ComputerPlan
  def ram_capacity
    capacity = 0
    @ram_list.each { |ram| capacity += ram.capacity }
    capacity
  end

  def hdd_capacity
    capacity = 0
    @hdd_list.each { |hdd| capacity += hdd.capacity }
    capacity
  end
end

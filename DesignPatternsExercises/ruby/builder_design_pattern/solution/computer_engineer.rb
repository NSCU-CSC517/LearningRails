require_relative 'computer_builder'

class ComputerEngineer
  # attr_reader __________(5)__________
  attr_reader :computer_builder

  def initialize
    # @computer_builder = __________(6)__________
    @computer_builder = ComputerBuilder.new
  end

  def build_computer
    # @computer_builder.__________(7)__________
    @computer_builder.computer
  end
end

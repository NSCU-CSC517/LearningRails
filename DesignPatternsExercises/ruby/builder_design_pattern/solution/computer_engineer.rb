require_relative 'computer_builder'

class ComputerEngineer
  # attr_reader __________(13)__________
  attr_reader :computer_builder

  def initialize
    # @computer_builder = __________(14)__________
    @computer_builder = ComputerBuilder.new
  end

  def make_computer
    # @computer_builder.__________(15)__________
    @computer_builder.computer
  end
end

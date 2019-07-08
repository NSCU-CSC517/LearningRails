require_relative 'computer_builder'

class ComputerEngineer
  # attr_reader __________(11)__________
  attr_reader :computer_builder

  def initialize
    # @computer_builder = __________(12)__________
    @computer_builder = ComputerBuilder.new
  end

  def make_computer
    # @computer_builder.__________(13)__________
    @computer_builder.computer
  end
end

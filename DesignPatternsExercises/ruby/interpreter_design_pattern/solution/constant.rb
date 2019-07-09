require_relative 'expression'

class Constant < Expression
  def initialize(constant)
    @constant = constant
  end

  # def __________(1)__________
  def interpret
    @constant.to_i
  end
end

require_relative 'expression'

class Constant < Expression
  def initialize(constant)
    @constant = constant
  end

  def __________(1)__________
    @constant.to_i
  end
end

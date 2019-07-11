require_relative 'statement'

class Constant < Statement
  # def __________(1)__________(constant)
  def initialize(constant)
    @constant = constant
  end

  # def __________(2)__________
  def interpret
    @constant.to_i
  end
end

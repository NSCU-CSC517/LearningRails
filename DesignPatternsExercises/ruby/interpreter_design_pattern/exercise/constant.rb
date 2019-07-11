require_relative 'statement'

class Constant < Statement
  def __________(1)__________(constant)
    @constant = constant
  end

  def __________(2)__________
    @constant.to_i
  end
end

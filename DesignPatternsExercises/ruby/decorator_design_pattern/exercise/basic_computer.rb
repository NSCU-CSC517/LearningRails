require_relative 'computer.rb'

class BasicComputer < Computer
  def __________(1)__________
    @ram = 256
    @rom = 4
  end

  def parts
    "RAM =#{@ram} MB ROM = #{@rom} GB"
  end

  def cost
    200
  end
end

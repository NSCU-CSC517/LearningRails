class Minion
  include __________(1)__________

  attr_accessor :name, :atk, :defense, :HP

  def initialize(minion_name, minion_atk, minion_def, minion_HP)
    @name = minion_name
    @atk = minion_atk.to_f
    @defense = minion_def.to_f
    @HP = minion_HP.to_f
  end

  def <=>(other)
    return __________(2)__________ if self.atk <= other.defense && other.atk <= self.defense
    return __________(3)__________ if self.atk <= other.defense || other.atk <= self.defense
    (__________(4)__________).ceil <=> (__________(5)__________).ceil
  end
end

# Implementation
footman = Minion.new('footman', 6, 5, 40)
archer = Minion.new('archer', 7, 4, 30)
rider = Minion.new('rider', 10, 6, 60)

puts [footman, archer, rider].max.name

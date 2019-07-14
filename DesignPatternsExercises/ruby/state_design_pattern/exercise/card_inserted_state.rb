require_relative 'atm_machine_states'

class CardInsertedState < AtmMachineStates
  def __________(9)__________
    puts 'Card is ejected...'
    true
  end

  def insert_card?
    puts 'Card is already inserted into ATM Machine slot...'
    false
  end

  def withdraw?
    puts 'Money are withdrawn...'
    true
  end
end

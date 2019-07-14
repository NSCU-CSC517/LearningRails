require_relative 'atm_machine_states'

class CardEjectedState < AtmMachineStates
  def __________(8)__________
    puts 'No card in ATM Machine slot, unable to eject the card...'
    false
  end

  def insert_card?
    puts 'Card is inserted...'
    true
  end

  def withdraw?
    puts 'No card in ATM Machine slot, unable to withdraw...'
    false
  end
end

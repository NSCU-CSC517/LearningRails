require_relative 'atm_machine_states'
require_relative 'card_ejected_state'
require_relative 'card_inserted_state'

class AtmMachine < AtmMachineStates
  def __________(1)__________
    @card_ejected_state = __________(2)__________
    @card_inserted_state = CardInsertedState.new
    __________(3)__________ = @card_ejected_state
  end

  def __________(4)__________
    @atm_machine_state.class
  end

  def eject_card?
    if __________(5)__________
      @atm_machine_state = @card_ejected_state
      return true
    end
    false
  end

  def insert_card?
    if __________(6)__________
      @atm_machine_state = @card_inserted_state
      return true
    end
    false
  end

  def withdraw?
    __________(7)__________
  end
end

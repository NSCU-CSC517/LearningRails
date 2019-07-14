require_relative 'atm_machine'

atm_machine = AtmMachine.new

puts "ATM Machine current state: #{atm_machine.atm_machine_state}"
atm_machine.withdraw?
atm_machine.eject_card?

puts "\nATM Machine current state: #{atm_machine.atm_machine_state}"
atm_machine.insert_card?

puts "\nATM Machine current state: #{atm_machine.atm_machine_state}"
atm_machine.withdraw?
atm_machine.eject_card?

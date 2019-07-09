require_relative 'computer_engineer'

computer_engineer = ComputerEngineer.new

computer = computer_engineer.make_computer
computer_builder = computer_engineer.computer_builder
computer_builder.add_hard_disk(64).add_ram(256).add_monitor(17).add_monitor(28).add_hard_disk(512).add_hard_disk(1024).add_hard_disk(2048).add_mouse('Optical')

puts 'Computer is assembled and with the following parts.'
puts 'List of Monitors:'
computer.monitor_list.each { |monitor| puts "    #{monitor.size} inches" }

puts 'List of RAMs:'
computer.ram_list.each { |ram| puts "    #{ram.capacity} MB" }

puts "Total Ram Capacity: #{computer.ram_capacity} MB"

puts 'List of HDDs:'
computer.hdd_list.each { |hdd| puts "    #{hdd.capacity} GB" }

puts "Total HDD Capacity: #{computer.hdd_capacity} GB"

computer.mouse ? (puts "Computer Mouse Type: #{computer.mouse.type}") : (puts 'Computer Mouse Type: NONE')

require_relative 'family_member'

father = FamilyMember.new(:Father)
puts "Current family balance: $#{father.balance}"
puts "\nFather deposits $1000"
father.deposit(1000)
puts "Balance after deposit: $#{father.balance}"

son = FamilyMember.new(:Son)
puts "\nSon withdraws $200"
son.withdraw(200)
puts "Balance after withdrawal: $#{son.balance}"

puts "\nSon withdraws $1000"
son.withdraw(1000)
puts "Balance after withdrawal: $#{son.balance}"

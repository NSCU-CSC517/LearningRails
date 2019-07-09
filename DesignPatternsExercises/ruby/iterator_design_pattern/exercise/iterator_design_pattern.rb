require_relative 'country_array'
require_relative 'country_set'

def __________(1)__________
  __________(2)__________.each { |country| puts "Country: #{country.name} -- Area: #{country.area} -- Population: #{country.population}" }
end

puts 'Array of Countries:'
@iterator = CountryArray.new.__________(3)__________
display_countries
puts ''

puts 'Set of Countries:'
@iterator = CountrySet.new.__________(4)__________
display_countries

require_relative 'home_theatre'
require_relative 'led_tv'
require_relative 'speaker'
require_relative 'warehouse'

tv1 = LedTV.new(10, 100)
tv2 = LedTV.new(20, 200)

speaker1 = Speaker.new(1000)
speaker2 = Speaker.new(2000)

warehouse = Warehouse.new

home_theatre = HomeTheatre.new(tv1, speaker1)
warehouse.add_memento(home_theatre.memento)

home_theatre = HomeTheatre.new(tv1, speaker2)
warehouse.add_memento(home_theatre.memento)

home_theatre = HomeTheatre.new(tv2, speaker1)
warehouse.add_memento(home_theatre.memento)

home_theatre = HomeTheatre.new(tv2, speaker2)
warehouse.add_memento(home_theatre.memento)

puts "-- -- Current Home Theatre State is #{HomeTheatre.state_count - 1} -- --"
puts "Home Theatre State #{HomeTheatre.state_count - 1}:\n    #{home_theatre.to_string}"

puts '-- -- Rollback to Home Theatre State 0 -- --'
home_theatre.memento = warehouse.memento(0)
puts "Home Theatre State 0:\n    #{home_theatre.to_string}"

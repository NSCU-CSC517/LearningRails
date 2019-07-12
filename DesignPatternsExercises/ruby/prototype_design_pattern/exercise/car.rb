class Car
  attr_writer __________(1)__________

  def __________(2)__________(model)
    @model = model
    @seats = 4
    @engine_volume = 2000
    @horse_power = 150
    puts 'Creating Car object...'
  end

  def print_details
    puts "Model: #{@model}\nNumber of Seats: #{@seats}\nEngine Volume: #{@engine_volume} cm^3\nHorse Power: #{@horse_power}"
  end
end

module Bike
  def travel_around_the_city
    puts 'It takes 5 hours'
  end
end

module Metro
  def travel_around_the_city
    puts 'It takes 2 hours'
  end
end

module Car
  def travel_around_the_city
    puts 'It takes 1 hour'
  end
end

class Vehicle
  include Bike
  def travel_around_the_city
    puts 'It should take some time'
  end
end

class CityVehicle < Vehicle
  include Metro
  include Car
end

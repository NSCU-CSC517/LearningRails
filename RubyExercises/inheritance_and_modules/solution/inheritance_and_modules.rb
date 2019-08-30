# The order in which classes or modules will be checked in to find the travel_around_the_city method is following:
# 1. CityVehicle
# 2. Car
# 3. Metro
# 4. Vehicle
# 5. Bike

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

CityVehicle.new.travel_around_the_city

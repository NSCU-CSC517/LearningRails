require_relative 'air_travel'
require_relative 'bus_travel'
require_relative 'car_travel'

travel = AirTravel.new
travel.template_travel

travel = BusTravel.new
travel.template_travel

travel = CarTravel.new
travel.template_travel

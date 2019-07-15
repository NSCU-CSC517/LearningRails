require_relative 'flight'

class FlightFactory
  # def __________(3)__________
  def initialize
    # __________(4)__________ = {}
    @flight_map = {}
  end

  def flight(flight_company)
    # return @flight_map[flight_company] if __________(5)__________.key? flight_company
    return @flight_map[flight_company] if @flight_map.key? flight_company

    # flight = __________(6)__________(flight_company)
    flight = Flight.new(flight_company)
    @flight_map[flight_company] = flight
    flight
  end
end

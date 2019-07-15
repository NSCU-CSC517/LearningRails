require_relative 'flight'

class FlightFactory
  def __________(3)__________
    __________(4)__________ = {}
  end

  def flight(flight_company)
    return @flight_map[flight_company] if __________(5)__________.key? flight_company

    flight = __________(6)__________(flight_company)
    @flight_map[flight_company] = flight
    flight
  end
end

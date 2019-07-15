class Flight
  # def __________(1)__________(company)
  def initialize(company)
    @company = company
  end

  # def __________(2)__________(flight_number, latitude, longitude)
  def draw_on_map(flight_number, latitude, longitude)
    puts "#{@company} flight #{flight_number} is currently at latitude #{latitude} and #{longitude} longitude"
  end
end

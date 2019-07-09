class Country
  attr_reader :name, :area, :population

  def initialize(name, area, population)
    @name = name
    @area = area
    @population = population
  end
end

require_relative 'country'

class CountryArray
  attr_reader __________(5)__________

  def initialize
    @country_array = [Country.new(:Australia, 100, 1000),
                      Country.new(:Chine, 200, 2000),
                      Country.new(:England, 300, 3000)]
  end
end
